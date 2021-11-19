package crownwebstore.crowninteractivewebstore.services.serviceImpl;

import crownwebstore.crowninteractivewebstore.model.Cart;
import crownwebstore.crowninteractivewebstore.model.Product;
import crownwebstore.crowninteractivewebstore.repository.CartRepository;
import crownwebstore.crowninteractivewebstore.repository.CustomerRepository;
import crownwebstore.crowninteractivewebstore.repository.ProductRepository;
import crownwebstore.crowninteractivewebstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private CartRepository cartRepository;
    private CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(CartRepository cartRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> viewAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product viewAProduct(Long productId) {
        return productRepository.findProductById(productId);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.delete(productRepository.findProductById(productId));
    }

    @Override
    public Product updateProduct(Long productId, Product product) {
        Product productToUpdate = productRepository.findProductById(productId);
        productToUpdate.setName(product.getName());
        productToUpdate.setPrice(product.getPrice());
        productToUpdate.setQuantity(product.getQuantity());
        productToUpdate.setCategory(product.getCategory());
        productRepository.save(productToUpdate);
        return productToUpdate;
    }


}
