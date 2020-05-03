package com.springbootHibernate.Dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springbootHibernate.Beans.Book;
import com.springbootHibernate.Beans.OldStudent;

@Repository("App Dao ")
public class AppDaoImpl implements AppDao {
	
     @Autowired
	private SessionFactory sessionfactory;
     
     @Autowired
     private JdbcTemplate jdbctemplate;
	
	
	public void checkdata() {
		System.out.println("inside dao "+sessionfactory);
		 Session session = sessionfactory.getCurrentSession();
	        Query query = session.createQuery(" select count(*), name,email from OldStudent group by name,email ");
	        
		/*
		 * Long count=(Long) query.getSingleResult(); System.out.println("int "+count);
		 */

	       ;

	        List<Object[]> list =query.list();
	        System.out.println("list "+list);
	        
	        for(Object[] x:list) {
	        	System.out.println(x[0]+","+x[1]+","+x[2]);
	        }
	        
	         session = sessionfactory.getCurrentSession();
	         query = session.createQuery(" select name,email,id from OldStudent");
	       
	         List result=query.list();
	        System.out.println("result "+result);

	        int k=2;
	        if(k>1) {
	        	System.out.println("inside k");
	        	
	        	OldStudent old=new OldStudent(788, "fdf", "Fdfdfsdf", "Dsdsd");
	        	session.saveOrUpdate(old);
		         
	        	 
	        	 
		       ;
		        
		        int k2=jdbctemplate.queryForObject("select count(*) from oldstudent", Integer.class);
		        System.out.println("jdbc count "+k2);
		        
		        
	        	
	        }
	        
	        
	        
	        
		/*
		 * System.out.println("list data "+list); for(OldStudent ss:list) { Object
		 * st=(OldStudent) ss;
		 * 
		 * System.out.println("listdata "+st);
		 * 
		 * }
		 */
	    	
	    	
	    	
	}


	@Override
	public List<Book> getbooks() {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		
		Query query=session.createQuery("from Book",Book.class);
		
		
		
		List<Book> list=query.getResultList();
		
		return list;
	}

	
	

	@Override
	public String createbook(Book book) {
		// TODO Auto-generated method stub
		Session session=sessionfactory.getCurrentSession();
		
	Long k= (Long) session.save(book);
	System.out.println("k "+k);
		return "book";
	}


	@Override
	public List<Book> getbooksbycategory(int id) {
		// TODO Auto-generated method stub
Session session=sessionfactory.getCurrentSession();
		
		Query query=session.createQuery("from Book where categoryId=:id",Book.class);
		query.setParameter("id", id);
		
		
		
		List<Book> list=query.getResultList();
	
		return list;
		
	}

	
	
}
