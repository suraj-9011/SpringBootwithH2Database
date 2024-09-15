package com.tcs.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.Book;

public interface BookRepo extends JpaRepository<Book,Serializable> {

}
