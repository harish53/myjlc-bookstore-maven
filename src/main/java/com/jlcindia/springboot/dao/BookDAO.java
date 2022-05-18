package com.jlcindia.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlcindia.springboot.entity.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{

}
