package com.in.muni.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in.muni.entity.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}
