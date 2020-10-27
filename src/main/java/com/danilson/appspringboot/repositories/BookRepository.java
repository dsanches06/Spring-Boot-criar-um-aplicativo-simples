package com.danilson.appspringboot.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.danilson.appspringboot.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);
}
