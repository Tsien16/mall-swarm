package com.tsien.mall.mbg.domain.model.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * 营销模块-优惠券和产品的关系表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsCouponProductRelation {
    /**
     * 主键
     */
    private Long id;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品编码
     */
    private String productSn;
}