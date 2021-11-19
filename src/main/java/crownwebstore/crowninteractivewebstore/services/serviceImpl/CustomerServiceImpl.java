package crownwebstore.crowninteractivewebstore.services.serviceImpl;

import crownwebstore.crowninteractivewebstore.dto.CustomerDTO;
import crownwebstore.crowninteractivewebstore.model.Cart;
import crownwebstore.crowninteractivewebstore.model.Customer;
import crownwebstore.crowninteractivewebstore.model.Product;
import crownwebstore.crowninteractivewebstore.repository.CartRepository;
import crownwebstore.crowninteractivewebstore.repository.CustomerRepository;
import crownwebstore.crowninteractivewebstore.repository.ProductRepository;
import crownwebstore.crowninteractivewebstore.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CartRepository cartRepository;
    private final CustomerRepository customerRepository;
    private final ProductRepository productRepository;

    @Autowired
    public CustomerServiceImpl(CartRepository cartRepository, CustomerRepository customerRepository, ProductRepository productRepository) {
        this.cartRepository = cartRepository;
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Customer getCustomer(Customer customer) {
        return null;
    }

    @Override
    public Cart addProductToCart(String username, Long productId) {
        Customer customer = customerRepository.findCustomerByUsername(username);
        Product product = productRepository.findProductById(productId);
        customer.getCart().getProductList().add(product);
        return customer.getCart();
    }

    @Override
    public Customer signUp(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer login(CustomerDTO customerDTO) {
        return customerRepository.findCustomerByUsername(customerDTO.getUsername()) != null ?
                customerRepository.findCustomerByUsername(customerDTO.getUsername()) : null;
    }

    @Override
    public String getCustomerIpAddress(String customerIpAddress) {
        return null;
    }
}
