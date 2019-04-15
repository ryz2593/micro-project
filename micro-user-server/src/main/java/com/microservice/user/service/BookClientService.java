package com.microservice.user.service;

import com.microservice.user.model.BookModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc 图书调用客户端
 */
@FeignClient(name = "api-gateway")
public interface BookClientService {
    @GetMapping("book/{bookId}")
    public BookModel getBook(@PathVariable("bookId") Integer bookId);
}
