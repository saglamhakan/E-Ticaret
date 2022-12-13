package entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "/products")

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_name")
    private String productName;
    @Column(name = "product_id")
    private int productId;
    @Column(name = "product_price")
    private int productPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Categories categories;


}
