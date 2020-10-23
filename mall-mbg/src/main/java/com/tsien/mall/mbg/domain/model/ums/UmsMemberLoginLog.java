package com.tsien.mall.mbg.domain.model.ums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-会员登录记录
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberLoginLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 会员ID
     */
    private Long memberId;

    /**
     * 省份
     */
    private String province;

    /**
     * 城市
     */
    private String city;

    /**
     * IP
     */
    private String ip;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    private Integer loginType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}