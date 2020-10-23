package com.tsien.mall.mbg.domain.model.pms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * 商品模块-画册图片表
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PmsAlbumPic {
    /**
     * 主键
     */
    private Long id;

    /**
     * 相册ID
     */
    private Long albumId;

    /**
     * 画册图片
     */
    private String pic;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}