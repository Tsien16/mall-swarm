package com.tsien.mall.mbg.dao.pms;

import com.tsien.mall.mbg.domain.model.pms.PmsMemberPrice;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

public interface PmsMemberPriceMapper {
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
    int insert(PmsMemberPrice record);

    /**
     * insert or update record to table
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdate(PmsMemberPrice record);

    /**
     * insert or update record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdateSelective(PmsMemberPrice record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsMemberPrice record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PmsMemberPrice selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsMemberPrice record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsMemberPrice record);

    /**
     * update batch
     *
     * @param list the record list
     * @return update count
     */
    int updateBatch(List<PmsMemberPrice> list);

    /**
     * update batch selective
     *
     * @param list the record list
     * @return update count
     */
    int updateBatchSelective(List<PmsMemberPrice> list);

    /**
     * insert batch
     *
     * @param list the record list
     * @return insert count
     */
    int batchInsert(@Param("list") List<PmsMemberPrice> list);
}