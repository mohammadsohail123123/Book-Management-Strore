package com.springbootHibernate.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.springbootHibernate.Beans.Book;
import com.springbootHibernate.Service.AppService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AppController {
	
     @Autowired
	AppService appservice; 
	
	@RequestMapping("/testing")
	public void check() {
		System.out.println("inside controller");
		appservice.checkdata();
	}
    
	@RequestMapping("/getBooks")
	public List<Book> getallbooks(){
	List<Book> list=	appservice.getbooks();
		return list;
	}
	
	@RequestMapping("/getBooksbycategory")
	public List<Book> getbooksbycategory(@RequestBody int id){
	List<Book> list=	appservice.getbooksbycategory(id);
		return list;
	}
    
	@RequestMapping("/createbook")
	public String createbook(@RequestBody Book book){
	System.out.println("Book Create "+book);
	String s=appservice.createbook(book);
	System.out.println("controller maessage create "+s);
	return "book";
	}

	

}
