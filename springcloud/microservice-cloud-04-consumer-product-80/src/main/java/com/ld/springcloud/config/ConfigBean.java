package com.ld.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ld
 */
@Configuration //标识配置类
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
