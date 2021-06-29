package com.hikvision.mp.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author renpeiqian
 * @date 2021/6/24 15:59
 */
@Configuration
public class mybatisConfig {

    /**
     * 分页插件的实例
     */
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        return new PaginationInnerInterceptor();
    }
}
