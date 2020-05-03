import { Component, OnInit } from '@angular/core';
import { bookBean } from './common-beans/Book';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  constructor(){
 console.log("inside cons")
  }
  ngOnInit(): void {
    console.log("inside init")
  }


}
