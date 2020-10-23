package com.tsien.mall.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-后台用户角色和权限关系表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@SpringBootApplication
@EnableOAuth2Sso
public class MallDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallDemoApplication.class, args);
	}

}
