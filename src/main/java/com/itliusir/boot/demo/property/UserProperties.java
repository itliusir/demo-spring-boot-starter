package com.itliusir.boot.demo.property;

import com.itliusir.boot.demo.Constants;
import com.itliusir.boot.demo.api.UserDetails;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * user 属性类
 *
 * @author liugang
 * @since 2018-08-10
 */
@ConfigurationProperties(prefix = Constants.PREFIX)
public class UserProperties {

    /**
     * Enable User Auto Configure,the default value is true
     * */
    private boolean enabled = true;

    /**
     * user name,the default value is ""
     * */
    private String name = "";

    /**
     * user age,the default value is Integer.MIN_VALUE
     * */
    private Integer age = Integer.MIN_VALUE;

    /**
     * user details
     * */
    @NestedConfigurationProperty
    private UserDetails details;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

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
