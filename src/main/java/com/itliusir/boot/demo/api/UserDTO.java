package com.itliusir.boot.demo.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * User传输实体
 *
 * @author liugang
 * @since 2018-08-10
 */
public class UserDTO implements Serializable{

    private static final long serialVersionUID = 3500675100920117216L;

    private String name;

    private Integer age;

    private UserDetails details;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserDetails getDetails() {
        return details;
    }

    public void setDetails(UserDetails details) {
        this.details = details;
    }
}
