import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';

import { HttpClientModule, HttpClient } from '@angular/common/http';
import { BookService } from './services/book.service';
import { Book } from './common/book';
import { BookListComponent } from './components/book-list/book-list.component';

@NgModule({
  declarations: [
    AppComponent,
    BookListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule 
  ],
  providers: [ BookService, HttpClient ],
  bootstrap: [AppComponent]
})
export class AppModule { }
