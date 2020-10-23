package com.tsien.mall.mbg.domain.model.sms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 营销模块-首页推荐专题表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsHomeRecommendSubject {
    /**
     * 主键
     */
    private Long id;

    /**
     * 专题ID
     */
    private Long subjectId;

    /**
     * 专题名称
     */
    private String subjectName;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    private Integer recommendStatus;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}