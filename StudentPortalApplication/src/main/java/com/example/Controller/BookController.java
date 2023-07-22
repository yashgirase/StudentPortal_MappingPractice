package com.example.Controller;

import com.example.Entity.Book;
import com.example.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;


    @PostMapping("book")
    public String addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }
    @GetMapping("book/id")
    public Optional<Book> getBookById(@RequestParam Integer id){
        return bookService.getBookById(id);
    }
    @GetMapping("books")
    public Iterable<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @PutMapping("Book/id/{id}/price/{price}")
    public String updatePriceOfBook(@PathVariable Integer id , @PathVariable Integer price){
        return bookService.updatePriceOfBook(id , price);
    }

    @DeleteMapping("Book/id/{id}")
    public String removeBook(@PathVariable Integer id){
        return bookService.removeBook(id);
    }
}