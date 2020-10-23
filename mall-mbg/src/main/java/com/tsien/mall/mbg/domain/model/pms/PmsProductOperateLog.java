package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-产品操作日志
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductOperateLog {
    /**
     * 主键
     */
    private Long id;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 原价格
     */
    private BigDecimal priceOld;

    /**
     * 新价格
     */
    private BigDecimal priceNew;

    /**
     * 原售价
     */
    private BigDecimal salePriceOld;

    /**
     * 新售价
     */
    private BigDecimal salePriceNew;

    /**
     * 原赠送的积分
     */
    private Integer giftPointOld;

    /**
     * 新赠送的积分
     */
    private Integer giftPointNew;

    /**
     * 原限制用户使用的积分
     */
    private Integer usePointLimitOld;

    /**
     * 新限制用户使用的积分
     */
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    private String operateMan;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}