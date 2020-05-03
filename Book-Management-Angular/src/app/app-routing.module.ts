import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookListComponent } from './components/book-list/book-list.component';
import { PageNotfoundComponent } from './components/page-notfound/page-notfound.component';


const routes: Routes = [
  {path: '', redirectTo:'/books' ,pathMatch:"full"},
  {path: 'books', component:BookListComponent},
  {path: 'category/:id', component:BookListComponent},
  {path: '**', component:PageNotfoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
