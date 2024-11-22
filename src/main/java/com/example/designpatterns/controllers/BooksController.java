package com.example.designpatterns.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BooksController {

    @GetMapping
    public String getAllBooks() {
        return "Returning all books";
    }

    @GetMapping("/{id}")
    public String getBookById(@PathVariable String id) {
        return "Details about book with ID: " + id;
    }

    @PostMapping
    public String createBook() {
        return "Book created";
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable String id) {
        return "Book with ID " + id + " updated";
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id) {
        return "Book with ID " + id + " deleted";
    }
}
