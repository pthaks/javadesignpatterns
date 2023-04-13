package com.prototype.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    public String bookShopName;
    public List<Book> books = new ArrayList<Book>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public void setBooks() {
        for(int i=0; i<10; i++){
            String bookname = "Book " + i;
            String author = "Book author " + i;
            this.books.add(new Book(bookname, author));
        }
    }

    public void printBooks(){
        for (Book b : books){
            System.out.println(b.toString());
        }
    }

//    //Override the clone method from interface --> Shallow copy
//    @Override
//    public BookShop clone() throws CloneNotSupportedException {
//        return(BookShop) super.clone();
//    }

    //Override the clone method from interface --> Deep copy
    @Override
    public BookShop clone() throws CloneNotSupportedException {

        BookShop bs = new BookShop();
        for(Book b : this.books){
            bs.getBooks().add(b);
        }

        return bs;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }

}
