package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce.model.Tag;

//the repository will get all functions from JpsRepository
//first value inside <> will be the Entity Name
//second value inside <> will be the ID data type
public interface TagRepository extends JpaRepository<Tag, Long>
{
	//Auto understand method is select * from PRODUCT where name like ''
	List<Tag> findByName(String name);
}
