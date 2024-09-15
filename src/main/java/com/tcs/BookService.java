package com.tcs;

import java.util.List;

public interface BookService {
	
	public String AddData(Book book);
	public String deleteRecord(Integer bookId);
	public List<Book> getAllData();

}
