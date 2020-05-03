import { Component, OnInit } from '@angular/core';
import { bookBean } from 'src/app/common-beans/Book';
import { BookService } from 'src/app/services/book.service';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {
    
  books: bookBean[] = []
 id:number ;
 checkid:boolean ;
  constructor(private bookservice:BookService,
    private routes:ActivatedRoute) { 
    console.log("inside book cons")
  }

  ngOnInit() {
    console.log("inside bok init")
    // this.bookservice.getallbooks().subscribe(data =>{
     
    //   this.books=data;
    
    // },error =>{
    //   console.log("error in response ",error.message)
    // })


   
    this.routes.params.subscribe(
      (params:Params) =>{
      this.checkid= this.routes.snapshot.paramMap.has('id');

      if(this.checkid){
        this.id=+params['id'];
        }
      else{ 
        this.id=1;
      }
 
       
        console.log("this id ",this.id,", ",typeof(this.id)+",length ",params.length)
       
        this.bookservice.getbooksbycategory(this.id).subscribe(data=>{
          console.log("data by category ",data)
          this.books=data;
        });
      

      }
    )
  }


  getdata(data:bookBean){
    console.log("bean ",data)
  }

  createnewbook(data:bookBean){
 console.log("book ",data)
 
 this.bookservice.createbook(data);
  
  }
}
