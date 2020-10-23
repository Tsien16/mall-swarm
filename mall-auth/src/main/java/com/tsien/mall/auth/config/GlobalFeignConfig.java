package com.tsien.mall.auth.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 22:50
 */

public class GlobalFeignConfig {

    /**
     * 配置Feign打印日志级别
     *
     * @return Logger.Level
     */
    @Bean
    public Logger.Level level() {

        return Logger.Level.FULL;
    }
}
