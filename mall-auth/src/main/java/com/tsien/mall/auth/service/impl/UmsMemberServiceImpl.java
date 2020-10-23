package com.tsien.mall.auth.service.impl;

import com.tsien.mall.common.domain.dto.UserDTO;
import com.tsien.mall.mbg.dao.ums.UmsMemberMapper;
import com.tsien.mall.mbg.domain.model.ums.UmsMember;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 18:39
 */

@Service
public class UmsMemberServiceImpl {

    @Resource
    private UmsMemberMapper umsMemberMapper;

    /**
     * 根据用户名查询用户
     *
     * @param username username
     * @return UserDTO
     */
    public UserDTO getUserByUsername(String username) {

        UmsMember umsMember = umsMemberMapper.getUserByUsername(username);
        if (umsMember != null) {
            return UserDTO.builder()
                    .id(umsMember.getId())
                    .username(umsMember.getUsername())
                    .password(umsMember.getPassword())
                    .status(umsMember.getStatus())
                    .build();
        }
        return null;
    }
}
