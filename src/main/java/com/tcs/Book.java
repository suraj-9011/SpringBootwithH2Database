package com.tcs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="BOOK_ID")
	private Integer bookid;
	
	@Column(name="BOOK_NAME")
	private String bookname;
	
	@Column(name="BOOK_PRICE")
	private Integer bookprice;

}
