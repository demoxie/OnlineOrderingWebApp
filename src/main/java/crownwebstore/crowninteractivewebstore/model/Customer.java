package crownwebstore.crowninteractivewebstore.model;

import crownwebstore.crowninteractivewebstore.enums.Gender;
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
@Table(name ="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String username;
    private String password;
    private String customerIpAddress;
    @OneToOne
    private Cart cart;

}
