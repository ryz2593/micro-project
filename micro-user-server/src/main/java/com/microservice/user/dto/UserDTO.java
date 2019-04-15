package com.microservice.user.dto;

import com.microservice.user.domain.UserInfo;
import com.microservice.user.model.BookModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@Getter
@Setter
public class UserDTO {
    private UserInfo user;
    private List<BookModel> bookList;
}
