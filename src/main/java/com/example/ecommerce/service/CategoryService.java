package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categoryRepo;
	
	//Create
	public Category create(Category category)
	{
		return categoryRepo.save(category);
	}
	
	//Get by ID
	public Category get(Long id)
	{
		//findById return Optional<Category>
		//Safe way to indicate that return data can either be Category or null
		return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
	}
	
	//Get all
	public List<Category> getAll()
	{
		return categoryRepo.findAll();
	}
}
