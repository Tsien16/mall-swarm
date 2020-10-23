package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类）
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductCategoryAttributeRelation {
    /**
     * 主键
     */
    private Long id;

    /**
     * 产品类别ID
     */
    private Long productCategoryId;

    /**
     * 产品参数ID
     */
    private Long productAttributeId;
}