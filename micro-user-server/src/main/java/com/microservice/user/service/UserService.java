package com.microservice.user.service;

import com.microservice.user.domain.UserInfo;
import com.microservice.user.dto.UserDTO;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
public interface UserService {
    UserInfo getUserById(Integer id);
    UserDTO getUserDto(Integer id);
}
