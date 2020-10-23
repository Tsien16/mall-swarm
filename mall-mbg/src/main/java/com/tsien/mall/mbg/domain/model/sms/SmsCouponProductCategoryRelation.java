package com.tsien.mall.mbg.domain.model.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * 营销模块-优惠券和产品分类关系表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsCouponProductCategoryRelation {
    /**
     * 主键
     */
    private Long id;

    /**
     * 优惠券ID
     */
    private Long couponId;

    /**
     * 产品分类ID
     */
    private Long productCategoryId;

    /**
     * 产品分类名称
     */
    private String productCategoryName;

    /**
     * 父分类名称
     */
    private String parentCategoryName;
}