package com.tsien.mall.mbg.domain.model.oms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 订单管理模块-退货原因表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:14
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderReturnReason {
    /**
     * 主键
     */
    private Long id;

    /**
     * 退货类型
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态：0->不启用；1->启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}