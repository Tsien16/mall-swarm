package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-商品审核记录
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsProductVerifyRecord {
    /**
     * 主键
     */
    private Long id;

    /**
     * 产品ID
     */
    private Long productId;

    /**
     * 审核人
     */
    private String verifyMan;

    /**
     * 反馈详情
     */
    private String detail;

    /**
     * 审核状态
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