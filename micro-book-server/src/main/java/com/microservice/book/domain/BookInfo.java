package com.microservice.book.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@Getter
@Setter
public class BookInfo {
    private Integer id;
    private String bookName;
    private String bookAuthor;
    private Date bookDate;
}
