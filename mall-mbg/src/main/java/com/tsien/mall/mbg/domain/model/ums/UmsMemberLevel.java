package com.tsien.mall.mbg.domain.model.ums;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 会员模块-会员等级表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UmsMemberLevel {
    /**
     * 主键
     */
    private Long id;

    /**
     * 会员等级名称
     */
    private String name;

    /**
     * 成长值
     */
    private Integer growthPoint;

    /**
     * 免运费标准
     */
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    private Integer privilegeFreeFreight;

    /**
     * 是否有签到特权
     */
    private Integer privilegeSignIn;

    /**
     * 是否有评论获奖励特权
     */
    private Integer privilegeComment;

    /**
     * 是否有专享活动特权
     */
    private Integer privilegePromotion;

    /**
     * 是否有会员价格特权
     */
    private Integer privilegeMemberPrice;

    /**
     * 是否有生日特权
     */
    private Integer privilegeBirthday;

    /**
     * 备注
     */
    private String note;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    private Integer defaultStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}