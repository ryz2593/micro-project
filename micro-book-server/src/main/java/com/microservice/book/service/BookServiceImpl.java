package com.microservice.book.service;

import com.microservice.book.domain.BookInfo;
import com.microservice.book.mapper.BookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    private BookMapper bookMapper;

    @Override
    public BookInfo getBookById(Integer bookId) {
        return bookMapper.getBook(bookId);
    }
}
