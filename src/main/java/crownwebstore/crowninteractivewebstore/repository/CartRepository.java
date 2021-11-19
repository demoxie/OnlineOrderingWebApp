package crownwebstore.crowninteractivewebstore.repository;

import crownwebstore.crowninteractivewebstore.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}
