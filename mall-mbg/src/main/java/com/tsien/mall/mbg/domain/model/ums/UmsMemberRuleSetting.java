package com.tsien.mall.mbg.domain.model.ums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-会员积分成长规则表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberRuleSetting {
    /**
     * 主键
     */
    private Long id;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    private Integer type;

    /**
     * 连续签到天数
     */
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    private Integer maxPointPerOrder;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}