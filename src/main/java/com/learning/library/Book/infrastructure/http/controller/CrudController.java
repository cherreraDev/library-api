package com.learning.library.Book.infrastructure.controller;

import com.learning.library.Book.application.BookCrudServiceImpl;
import com.learning.library.Book.domain.interfaces.BookCrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/library/book")
public class CrudController {
    private final BookCrudService bookCrudService;

    public CrudController( BookCrudService bookCrudService) {
        this.bookCrudService = bookCrudService;
    }
}
