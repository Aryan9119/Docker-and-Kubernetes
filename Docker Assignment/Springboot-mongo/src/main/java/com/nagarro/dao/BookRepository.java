package com.nagarro.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nagarro.model.Book;

public interface BookRepository extends MongoRepository<Book,Integer> {
}
