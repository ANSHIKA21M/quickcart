package com.quickcart.product_service.repository;
import com.quickcart.product_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByStockLessThan(int stock);

    List<Product> findTop3ByOrderByPriceDesc();
}