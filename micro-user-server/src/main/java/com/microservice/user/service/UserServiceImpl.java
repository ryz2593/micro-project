package com.microservice.user.service;

import com.google.common.collect.Lists;
import com.microservice.user.domain.UserInfo;
import com.microservice.user.dto.UserDTO;
import com.microservice.user.mapper.UserMapper;
import com.microservice.user.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    public UserMapper userMapper;

    @Resource
    private BookClientService bookClientService;

    @Override
    public UserInfo getUserById(Integer id) {
        return userMapper.getUser(id);
    }

    @Override
    public UserDTO getUserDto(Integer userId) {
        UserDTO userDTO = new UserDTO();
        UserInfo user = userMapper.getUser(userId);
        userDTO.setUser(user);

        BookModel bookModel = bookClientService.getBook(user.getBookId());
//        List<BookModel> bookList = Lists.newArrayList();
//        bookList.add(bookModel);
//        userDTO.setBookList(bookList);
        userDTO.setBookList(Arrays.asList(bookModel));

        return userDTO;
    }


}
