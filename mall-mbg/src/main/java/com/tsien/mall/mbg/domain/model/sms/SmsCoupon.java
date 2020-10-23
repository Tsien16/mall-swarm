package com.tsien.mall.mbg.domain.model.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 营销模块-优惠卷表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsCoupon {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 使用平台：0->全部；1->移动；2->PC；3->小程序
     */
    private Integer platform;

    /**
     * 优惠卷类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    private Integer type;

    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    private Integer useType;

    /**
     * 使用门槛；0表示无门槛
     */
    private BigDecimal minPoint;

    /**
     * 数量
     */
    private Integer count;

    /**
     * 发行数量
     */
    private Integer publishCount;

    /**
     * 已使用数量
     */
    private Integer useCount;

    /**
     * 领取数量
     */
    private Integer receiveCount;

    /**
     * 金额
     */
    private BigDecimal amount;

    /**
     * 可领取的会员类型：0->无限时
     */
    private Integer memberLevel;

    /**
     * 每人限领张数
     */
    private Integer perLimit;

    /**
     * 优惠码
     */
    private String code;

    /**
     * 可以领取的日期
     */
    private LocalDateTime enableTime;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}