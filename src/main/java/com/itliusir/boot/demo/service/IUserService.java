package com.itliusir.boot.demo.service;

import com.itliusir.boot.demo.api.UserDTO;

/**
 * user interface
 *
 * @author liugang
 * @since 2018-08-10
 */
public interface IUserService {

    /**
     * query user config
     *
     * @return UserDTO
     * @author liugang 2018-08-10 15:11
     * */
    UserDTO queryUser();
}
