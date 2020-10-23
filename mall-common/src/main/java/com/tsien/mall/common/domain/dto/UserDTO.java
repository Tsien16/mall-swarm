package com.tsien.mall.common.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * 登录用户信息
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 21:25
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 账号状态
     */
    private Integer status;

    /**
     * 登录客户端ID
     */
    private String clientId;

    /**
     * 角色
     */
    private List<String> roles;

}
