package com.tsien.mall.mbg.dao.sms;

import com.tsien.mall.mbg.domain.model.sms.SmsCouponProductCategoryRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

public interface SmsCouponProductCategoryRelationMapper {
    /**
     * delete by primary key
     *
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     *
     * @param record the record
     * @return insert count
     */
    int insert(SmsCouponProductCategoryRelation record);

    /**
     * insert or update record to table
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdate(SmsCouponProductCategoryRelation record);

    /**
     * insert or update record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdateSelective(SmsCouponProductCategoryRelation record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(SmsCouponProductCategoryRelation record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);

    /**
     * update batch
     *
     * @param list the record list
     * @return update count
     */
    int updateBatch(List<SmsCouponProductCategoryRelation> list);

    /**
     * update batch selective
     *
     * @param list the record list
     * @return update count
     */
    int updateBatchSelective(List<SmsCouponProductCategoryRelation> list);

    /**
     * insert batch
     *
     * @param list the record list
     * @return insert count
     */
    int batchInsert(@Param("list") List<SmsCouponProductCategoryRelation> list);
}