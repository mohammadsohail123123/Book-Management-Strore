import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { bookBean } from '../common-beans/Book';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private url="http://localhost:8080";
  constructor(private http:HttpClient) { }







  getallbooks():Observable<bookBean[]>{

    return this.http.get<bookBean[]>(this.url+"/getBooks");
  }

  getbooksbycategory(id: number):Observable<bookBean[]>{
    
    return this.http.post<bookBean[]>(this.url+"/getBooksbycategory",id);

  }
  createbook(book:bookBean){
    const headers = new HttpHeaders({'Content-Type': 'application/json'});
     var name="testih";
    this.http.post(this.url+"/createbook",book, { headers, responseType:'text'}).subscribe(data =>{
      console.log("record inserted ",data);
    });
  }
  
}
