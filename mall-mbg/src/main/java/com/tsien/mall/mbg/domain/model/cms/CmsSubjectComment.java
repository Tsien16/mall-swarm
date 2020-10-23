package com.tsien.mall.mbg.domain.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 内容管理模块-专题评论表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubjectComment {
    /**
     * 主键
     */
    private Long id;

    /**
     * 专题ID
     */
    private Long subjectId;

    /**
     * 评论人员昵称
     */
    private String memberNickName;

    /**
     * 评论人员图标
     */
    private String memberIcon;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 展示状态：0->不展示；1->展示
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