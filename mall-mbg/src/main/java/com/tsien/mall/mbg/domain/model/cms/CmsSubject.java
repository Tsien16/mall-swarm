package com.tsien.mall.mbg.domain.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 内容管理模块-专题表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubject {
    /**
     * 主键
     */
    private Long id;

    /**
     * 类别ID
     */
    private Long categoryId;

    /**
     * 专题分类名称
     */
    private String categoryName;

    /**
     * 标题
     */
    private String title;

    /**
     * 专题主图
     */
    private String pic;

    /**
     * 画册图片用逗号分割
     */
    private String albumPics;

    /**
     * 关联产品数量
     */
    private Integer productCount;

    /**
     * 描述
     */
    private String description;

    /**
     * 内容
     */
    private String content;

    /**
     * 阅读数
     */
    private Integer readCount;

    /**
     * 收藏数
     */
    private Integer collectCount;

    /**
     * 评论数
     */
    private Integer commentCount;

    /**
     * 转发数
     */
    private Integer forwardCount;

    /**
     * 推荐状态：0->不推荐；1->推荐
     */
    private Integer recommendStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    private Integer showStatus;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}