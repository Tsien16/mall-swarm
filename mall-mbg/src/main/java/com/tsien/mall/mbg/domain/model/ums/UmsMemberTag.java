package com.tsien.mall.mbg.domain.model.ums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-用户标签表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberTag {
    /**
     * 主键
     */
    private Long id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 自动打标签完成订单数量
     */
    private Integer finishOrderCount;

    /**
     * 自动打标签完成订单金额
     */
    private BigDecimal finishOrderAmount;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}