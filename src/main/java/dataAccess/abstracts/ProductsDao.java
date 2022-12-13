package dataAccess.abstracts;

import entities.concretes.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.net.ContentHandler;

public interface ProductsDao extends JpaRepository<Products, Integer> {

    Products getByProductName(String productName);
    Products getByProductId(int productId);

    Products findAll(Pageable pageable);
}
