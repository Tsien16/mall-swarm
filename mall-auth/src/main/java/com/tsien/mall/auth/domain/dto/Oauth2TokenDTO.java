package com.tsien.mall.auth.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Oauth2获取Token返回信息封装
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 0:10
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Oauth2TokenDTO {

    /**
     * 访问令牌
     */
    private String token;

    /**
     * 刷新令牌
     */
    private String refreshToken;

    /**
     * 访问令牌头前缀
     */
    private String tokenHead;

    /**
     * 有效时间（秒）
     */
    private Integer expiresIn;

}
