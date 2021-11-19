package crownwebstore.crowninteractivewebstore.repository;

import crownwebstore.crowninteractivewebstore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findProductById(Long productId);


}
