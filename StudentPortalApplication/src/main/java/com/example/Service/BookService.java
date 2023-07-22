package com.example.Service;

import com.example.Entity.Book;
import com.example.Repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    IBookRepo bookRepo;

    public String addBook(Book book) {
        bookRepo.save(book);
        return "book added successfully";
    }

    public Optional<Book> getBookById(Integer id) {
        return bookRepo.findById(id);
    }

    public Iterable<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updatePriceOfBook(Integer id, Integer price) {
        Optional<Book> optional = bookRepo.findById(id);
        Book book;
        if(optional.isPresent()){
            book = optional.get();
        }else{
            return "book not found with id " + id;
        }
        book.setPrice(price);
        bookRepo.save(book);
        return "book price for book with id "+id+ " successfully updated as "+price;
    }

    public String removeBook(Integer id) {
        bookRepo.deleteById(id);
        return "book with id "+id+" is removed successfully..";
    }
}