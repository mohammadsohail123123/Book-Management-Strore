package com.springbootHibernate.Service;

import java.util.List;

import com.springbootHibernate.Beans.Book;

public interface AppService {

	public void checkdata();

	public List<Book> getbooks();

	public String createbook(Book book);

	public List<Book> getbooksbycategory(int id);



}
