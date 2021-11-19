package crownwebstore.crowninteractivewebstore.services;

import crownwebstore.crowninteractivewebstore.model.Cart;
import crownwebstore.crowninteractivewebstore.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> viewAllProducts();
    Product viewAProduct(Long productId);
    void deleteProduct(Long productId);
    Product updateProduct(Long productId, Product product);
}
