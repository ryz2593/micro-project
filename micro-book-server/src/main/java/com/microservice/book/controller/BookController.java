package com.microservice.book.controller;

import com.microservice.book.domain.BookInfo;
import com.microservice.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("book/{bookId}")
    public BookInfo getBook(@PathVariable("bookId") Integer bookId) {
        return bookService.getBookById(bookId);
    }
}
