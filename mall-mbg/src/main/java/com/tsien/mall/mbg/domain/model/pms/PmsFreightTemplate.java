package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-运费模版
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsFreightTemplate {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 计费类型:0->按重量；1->按件数
     */
    private Integer chargeType;

    /**
     * 首重kg
     */
    private BigDecimal firstWeight;

    /**
     * 首费（元）
     */
    private BigDecimal firstFee;

    /**
     * 增加重量
     */
    private BigDecimal continueWeight;

    /**
     * 增加的费用
     */
    private BigDecimal continueFee;

    /**
     * 目的地（省、市）
     */
    private String dest;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}