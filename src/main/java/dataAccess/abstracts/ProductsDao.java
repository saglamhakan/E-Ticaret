package dataAccess.abstracts;

import entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface ProductsDao extends JpaRepository<Product, Integer> {

    Product getByProductName(String productName);
    Product getByProductId(int productId);

    Product findAll(Pageable pageable);
}
