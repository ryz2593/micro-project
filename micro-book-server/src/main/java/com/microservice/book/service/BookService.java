package com.microservice.book.service;

import com.microservice.book.domain.BookInfo;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
public interface BookService {
    BookInfo getBookById(Integer bookId);
}
