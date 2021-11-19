package crownwebstore.crowninteractivewebstore.controller;

import crownwebstore.crowninteractivewebstore.model.Product;
import crownwebstore.crowninteractivewebstore.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="product/")
public class ProductController {
    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping(value ="/all/")
    public ResponseEntity<?> viewAllProduct(){
        List<Product> productList = productService.viewAllProducts();
        return productList != null ? new ResponseEntity <>(productList, HttpStatus.OK):new ResponseEntity <>(null,HttpStatus.NO_CONTENT);
    }
    @GetMapping(value ="view/{productId}")
    public ResponseEntity<?> getAProduct(@PathVariable Long productId){
        Product product = productService.viewAProduct(productId);
        return product != null ? new ResponseEntity <>(product, HttpStatus.OK):new ResponseEntity <>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping(value ="delete/{productId}")
    public void deleteAProduct(@PathVariable Long productId){
        productService.deleteProduct(productId);
    }

}
