package com.example.designpatterns.services;

import com.example.designpatterns.models.Book;
import com.example.designpatterns.repositories.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BooksRepository booksRepository;

    @Autowired
    public BookService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Optional<Book> getBookById(Integer id) {
        return booksRepository.findById(id);
    }

    public Book createBook(Book book) {
        return booksRepository.save(book);
    }

    public Book updateBook(Integer id, Book bookDetails) {
        return booksRepository.findById(id).map(book -> {
            book.setTitle(bookDetails.getTitle());
            book.setAuthors(bookDetails.getAuthors());
            return booksRepository.save(book);
        }).orElseThrow(() -> new RuntimeException("Book not found with id " + id));
    }

    public void deleteBook(Integer id) {
        booksRepository.deleteById(id);
    }
}
