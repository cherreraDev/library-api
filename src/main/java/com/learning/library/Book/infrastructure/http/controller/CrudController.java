package com.learning.library.Book.infrastructure.http.controller;

import com.learning.library.Book.domain.interfaces.BookCrudService;
import com.learning.library.Book.domain.model.Book;
import com.learning.library.Book.infrastructure.http.model.BookResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/library/book")
public class CrudController {

    private final BookCrudService bookCrudService;

    public CrudController(BookCrudService bookCrudService) {
        this.bookCrudService = bookCrudService;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }


    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable("id")UUID id){
        Optional<Book> book = bookCrudService.findById(id);
        return book.map(BookResponse::new).orElse(null);
    }



}
