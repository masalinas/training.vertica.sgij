package com.thingtrack.training.vertica.sgij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thingtrack.training.vertica.sgij.domain.Product;
import com.thingtrack.training.vertica.sgij.domain.ProductId;

@Repository
public interface ProductRepository extends JpaRepository<Product, ProductId> {    
}