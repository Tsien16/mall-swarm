package com.tsien.mall.mbg.domain.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 内容管理模块-话题表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsTopic {
    /**
     * 主键
     */
    private Long id;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 话题名称
     */
    private String name;

    /**
     * 话题内容
     */
    private String content;

    /**
     * 开始时间
     */
    private LocalDateTime startTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 阅读人数
     */
    private Integer readCount;

    /**
     * 参与人数
     */
    private Integer attendCount;

    /**
     * 参与方式
     */
    private String attendType;

    /**
     * 关注人数
     */
    private Integer attentionCount;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}