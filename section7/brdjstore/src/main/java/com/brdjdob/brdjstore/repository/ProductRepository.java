package com.brdjdob.brdjstore.repository;

import com.brdjdob.brdjstore.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Optional
public interface ProductRepository extends JpaRepository<Product, Long> {
}
