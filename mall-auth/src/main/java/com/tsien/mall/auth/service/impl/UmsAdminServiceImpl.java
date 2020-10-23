package com.tsien.mall.auth.service.impl;

import com.tsien.mall.common.domain.dto.UserDTO;
import com.tsien.mall.mbg.dao.ums.UmsAdminMapper;
import com.tsien.mall.mbg.dao.ums.UmsRoleMapper;
import com.tsien.mall.mbg.domain.model.ums.UmsAdmin;
import com.tsien.mall.mbg.domain.model.ums.UmsRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 17:55
 */

@Service
public class UmsAdminServiceImpl {

    @Resource
    private UmsAdminMapper umsAdminMapper;

    @Resource
    private UmsRoleMapper umsRoleMapper;

    /**
     * 根据用户名查询用户
     *
     * @param username username
     * @return UserDTO
     */
    public UserDTO getUserByUsername(String username) {
        UmsAdmin umsAdmin = umsAdminMapper.getUserByUsername(username);
        if (umsAdmin != null) {
            List<UmsRole> umsRoleList = umsRoleMapper.listRolesByAdminId(umsAdmin.getId());
            List<String> roleNameList = umsRoleList.stream().map(UmsRole::getName).collect(Collectors.toList());

            return UserDTO.builder()
                    .id(umsAdmin.getId())
                    .username(umsAdmin.getUsername())
                    .password(umsAdmin.getPassword())
                    .roles(roleNameList)
                    .status(umsAdmin.getStatus())
                    .build();
        }
        return null;
    }
}
