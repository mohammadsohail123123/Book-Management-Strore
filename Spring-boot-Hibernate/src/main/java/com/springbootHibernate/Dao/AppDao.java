package com.springbootHibernate.Dao;

import java.util.List;

import com.springbootHibernate.Beans.Book;

public interface AppDao {

	public void  checkdata();
		// TODO Auto-generated method stub

	public List<Book> getbooks();

	public String createbook(Book book);

	public List<Book> getbooksbycategory(int id);
		
	

}
