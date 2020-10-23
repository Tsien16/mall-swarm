package com.tsien.mall.auth.service.feign;

import com.tsien.mall.common.domain.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 23:06
 */

@FeignClient("mall-admin")
public interface UmsAdminService {

    /**
     * 根据用户名称查询用户
     *
     * @param username username
     * @return UserDTO
     */
    @GetMapping("/admin/loadByUsername")
    UserDTO loadUserByUsername(String username);
}
