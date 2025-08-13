package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping
	public Product addProduct (@RequestBody Product product, @RequestParam long categoryId, @RequestParam List<Long> tagIds)
	{
		//better use DTO
		return productService.createProduct(product, categoryId, tagIds);
	}
	
	@GetMapping
	public List<Product> getAllProducts()
	{
		return productService.getAllProduct();
	}
}
