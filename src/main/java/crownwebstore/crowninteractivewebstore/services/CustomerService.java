package crownwebstore.crowninteractivewebstore.services;

import crownwebstore.crowninteractivewebstore.dto.CustomerDTO;
import crownwebstore.crowninteractivewebstore.model.Cart;
import crownwebstore.crowninteractivewebstore.model.Customer;

public interface CustomerService {
    Customer getCustomer(Customer customer);
    Cart addProductToCart(String username, Long productId);
    Customer signUp(Customer customer);
    Customer login(CustomerDTO customerDTO);
    String getCustomerIpAddress(String customerIpAddress);
}
