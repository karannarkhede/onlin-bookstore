package com.karan.onlinebookstore.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.karan.onlinebookstore.entity.Book;
import com.karan.onlinebookstore.entity.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory" , path="book-category")
@CrossOrigin("http://localhost:4200")

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
	
	
}
