package com.springbootHibernate.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.springbootHibernate.Beans.Book;
import com.springbootHibernate.Dao.AppDao;




@Service("App service")
@Transactional
public class AppServiceImpl implements AppService {
     
	@Autowired
	AppDao appdao;
	
	
	public void checkdata() {
		// TODO Auto-generated method stub
		
		appdao.checkdata();
	}


	@Override
	public List<Book> getbooks() {
		// TODO Auto-generated method stub
		return appdao.getbooks();
	}


	@Override
	public String createbook(Book book) {
		// TODO Auto-generated method stub
		return appdao.createbook(book);
	}


	@Override
	public List<Book> getbooksbycategory(int id) {
		// TODO Auto-generated method stub
		return appdao.getbooksbycategory(id);
	}

}
