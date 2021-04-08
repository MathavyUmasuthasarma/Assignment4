package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.demo.bookmodel.BookModel;

public interface BookRepository extends MongoRepository<BookModel, String >{
//	List<BookModel> findByTitleContaining(String title);
	
	@Query("{'$or':[ {'title': {$regex : ?0, $options: 'i'}}, {'author': {$regex : ?0, $options: 'i'}}, {'language': {$regex : ?0, $options: 'i'}}, {'genre': {$regex : ?0, $options: 'i'}}]}")
	Page<BookModel> searchBooks(Pageable pageable, String searchText);
}
