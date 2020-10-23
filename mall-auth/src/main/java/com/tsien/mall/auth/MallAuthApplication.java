package com.tsien.mall.auth;

import com.tsien.mall.auth.config.GlobalFeignConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@SpringBootApplication(scanBasePackages = "com.tsien.mall.*")
@EnableFeignClients(defaultConfiguration = GlobalFeignConfig.class)
@MapperScan("com.tsien.mall.*.dao")
public class MallAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAuthApplication.class, args);
    }

}
