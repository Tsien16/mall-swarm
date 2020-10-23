package com.tsien.mall.mbg.domain.model.ums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-后台用户和角色关系表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmsAdminRoleRelation {
    /**
     * 主键
     */
    private Long id;

    /**
     * 后台用户ID
     */
    private Long adminId;

    /**
     * 角色ID
     */
    private Long roleId;
}