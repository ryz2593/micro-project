package com.microservice.book.mapper;

import com.microservice.book.domain.BookInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
public interface BookMapper {
    @Select("select id, book_name, book_author, book_date from tb_book where id = #{bookId}")
    BookInfo getBook(@Param("bookId") Integer bookId);
}
