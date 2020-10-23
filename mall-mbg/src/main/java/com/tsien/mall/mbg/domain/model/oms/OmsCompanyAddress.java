package com.tsien.mall.mbg.domain.model.oms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 订单管理模块-公司收发货地址表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:14
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OmsCompanyAddress {
    /**
     * 主键
     */
    private Long id;

    /**
     * 地址名称
     */
    private String addressName;

    /**
     * 收发货人姓名
     */
    private String name;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 邮政编码
     */
    private String postCode;

    /**
     * 省/直辖市
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String region;

    /**
     * 详细地址
     */
    private String detailAddress;

    /**
     * 默认发货地址：0->否；1->是
     */
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    private Integer receiveStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}