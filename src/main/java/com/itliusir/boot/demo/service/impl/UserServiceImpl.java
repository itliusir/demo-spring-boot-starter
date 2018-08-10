package com.itliusir.boot.demo.service.impl;

import com.itliusir.boot.demo.api.UserDTO;
import com.itliusir.boot.demo.property.UserProperties;
import com.itliusir.boot.demo.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * UserService IMPL
 *
 * @author liugang
 * @since 2018-08-10
 */
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserProperties userProperties;

    @Override
    public UserDTO queryUser() {
        UserDTO userDTO = new UserDTO();
        if(userProperties.isEnabled()){
            BeanUtils.copyProperties(userProperties,userDTO);
        }
        return userDTO;
    }
}
