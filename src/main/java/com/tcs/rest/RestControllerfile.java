package com.tcs.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.Book;
import com.tcs.BookService;



@RestController
public class RestControllerfile {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public ResponseEntity<String> index(){
		
		String msg="Welcome to our Book Store!";
		
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	@PostMapping("/book")
	public ResponseEntity<String> AddData(Book book){
		
		String msg=service.AddData(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllData(){
		List<Book> list= service.getAllData();
		return new ResponseEntity<>(list,HttpStatus.OK);
		
	}
	@DeleteMapping("/book")
	public ResponseEntity<String> deleteRecord(Integer id){
		String msg=service.deleteRecord(id);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}

}
