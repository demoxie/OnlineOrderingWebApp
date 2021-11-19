package crownwebstore.crowninteractivewebstore.model;

import crownwebstore.crowninteractivewebstore.enums.Category;
import crownwebstore.crowninteractivewebstore.enums.Gender;
import crownwebstore.crowninteractivewebstore.enums.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    private Cart cart;
    private String name;
    private Integer quantity;
    private double price;
    private Category category;
    private Size size;

}
