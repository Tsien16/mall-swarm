package com.tsien.mall.mbg.domain.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 内容管理模块-优选专区
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsPreferenceArea {
    /**
     * 主键
     */
    private Long id;

    /**
     * 优选名称
     */
    private String name;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 展示图片
     */
    private byte[] pic;

    /**
     * 排序
     */
    private Integer sort;

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