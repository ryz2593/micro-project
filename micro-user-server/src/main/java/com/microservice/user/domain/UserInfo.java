package com.microservice.user.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ryz2593
 * @date 2019/4/15
 * @desc
 */
@Getter
@Setter
public class UserInfo {
    private Integer id;
    private String userName;
    private String userCard;
    private Integer bookId;

}
