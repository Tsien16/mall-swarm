package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-产品满减表(只针对同商品)
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductFullReduction {
    /**
     * 主键
     */
    private Long id;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 满减价格
     */
    private BigDecimal fullPrice;

    /**
     * 减去的价格
     */
    private BigDecimal reducePrice;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}