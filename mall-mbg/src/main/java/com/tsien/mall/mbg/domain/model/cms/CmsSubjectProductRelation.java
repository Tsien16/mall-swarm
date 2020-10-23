package com.tsien.mall.mbg.domain.model.cms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * 内容管理模块-专题商品关系表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:13
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CmsSubjectProductRelation {
    /**
     * 主键
     */
    private Long id;

    /**
     * 专题ID
     */
    private Long subjectId;

    /**
     * 产品ID
     */
    private Long productId;
}