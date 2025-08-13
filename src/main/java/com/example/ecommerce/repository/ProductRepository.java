package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Product;

//the repository will get all functions from JpsRepository
//first value inside <> will be the Entity Name
//second value inside <> will be the ID data type
public interface ProductRepository extends JpaRepository<Product, Long>
{
	//Auto understand method is select * from PRODUCT where name like ''
	List<Product> findByName(String name);
	
	//will mapped to select * from PRODUCT where price <= input price
	List<Product> findByPriceLessThanEqual(double price);
}
