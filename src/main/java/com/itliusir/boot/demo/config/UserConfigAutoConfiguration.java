package com.itliusir.boot.demo.config;

import com.itliusir.boot.demo.Constants;
import com.itliusir.boot.demo.property.UserProperties;
import com.itliusir.boot.demo.service.IUserService;
import com.itliusir.boot.demo.service.impl.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author liugang
 * @since 2018-08-10
 */
@Configuration
//@ConditionalOnProperty(value = {Constants.USER_CONFIG_ENABLED}, matchIfMissing = true)
@EnableConfigurationProperties(UserProperties.class)
public class UserConfigAutoConfiguration {

    /**
     * 测试Bean
     *
     * @author liugang 2018-08-10 15:30
     * */
    @Bean
    public IUserService iUserService(){
        return new UserServiceImpl();
    }
}
