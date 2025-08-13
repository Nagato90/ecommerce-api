package com.example.ecommerce.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.repository.ProductRepository;
import com.example.ecommerce.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private TagService tagService;
	
	//Create
	public Product createProduct(Product product, long categoryId, List<Long> tagIds)
	{
		//when add product will get category and set to product
		product.setCategory(categoryService.get(categoryId));
		//when add product will get tags and set to product
		//transform List to Set
		product.setTags(Set.copyOf(tagService.getByIds(tagIds)));
		
		return productRepo.save(product);
	}
	
	//Read
	public List<Product> getAllProduct()
	{
		return productRepo.findAll();
	}
	
	//Read by Id
	
	
	//Update
	
	//Delete
	
}
