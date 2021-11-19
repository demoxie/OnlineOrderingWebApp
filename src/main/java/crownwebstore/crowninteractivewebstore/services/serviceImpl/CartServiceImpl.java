package crownwebstore.crowninteractivewebstore.services.serviceImpl;

import crownwebstore.crowninteractivewebstore.repository.CartRepository;
import crownwebstore.crowninteractivewebstore.repository.CustomerRepository;
import crownwebstore.crowninteractivewebstore.repository.ProductRepository;
import crownwebstore.crowninteractivewebstore.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {

    private CartRepository cartRepository;
    private CustomerRepository customerRepository;
    private ProductRepository productRepository;

    @Autowired
    public CartServiceImpl(CartRepository cartRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }
}
