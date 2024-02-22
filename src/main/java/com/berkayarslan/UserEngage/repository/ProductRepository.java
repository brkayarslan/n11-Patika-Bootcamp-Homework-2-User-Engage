package com.berkayarslan.UserEngage.repository;

import com.berkayarslan.UserEngage.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
