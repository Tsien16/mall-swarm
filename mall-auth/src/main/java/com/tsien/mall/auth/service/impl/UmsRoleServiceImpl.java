package com.tsien.mall.auth.service.impl;

import com.tsien.mall.mbg.dao.ums.UmsRoleMapper;
import com.tsien.mall.mbg.domain.model.ums.UmsRole;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 17:29
 */

@Service
public class UmsRoleServiceImpl {

    @Resource
    private UmsRoleMapper umsRoleMapper;

    /**
     * 根据adminId查询角色
     *
     * @param adminId adminId
     * @return List<UmsRole>
     */
    public List<UmsRole> listRolesByAdminId(Long adminId) {
        return umsRoleMapper.listRolesByAdminId(adminId);
    }

}
