package com.tsien.mall.mbg.domain.model.oms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 订单管理模块-订单操作历史记录
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:14
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OmsOrderOperateHistory {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 操作人：用户；系统；后台管理员
     */
    private String operateMan;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    private Integer orderStatus;

    /**
     * 备注
     */
    private String note;

    /**
     * 操作时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}