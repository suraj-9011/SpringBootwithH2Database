package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tcs.Book;
import com.tcs.BookService;
import com.tcs.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {

	private BookRepo repository;
	
	public BookServiceImpl(BookRepo repository){
		this.repository=repository;
	}
	
	@Override
	public String AddData(Book book) {
		repository.save(book);
		return "record added";
	}

	@Override
	public String deleteRecord(Integer bookId) {
		repository.deleteById(bookId);
		return "record deleted";
	}

	@Override
	public List<Book> getAllData() {
		
		return repository.findAll();
	}
	

}
