package com.tsien.mall.mbg.dao.pms;

import com.tsien.mall.mbg.domain.model.pms.PmsProductVerifyRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:15
 */

public interface PmsProductVerifyRecordMapper {
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
    int insert(PmsProductVerifyRecord record);

    /**
     * insert or update record to table
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdate(PmsProductVerifyRecord record);

    /**
     * insert or update record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdateSelective(PmsProductVerifyRecord record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(PmsProductVerifyRecord record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    PmsProductVerifyRecord selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(PmsProductVerifyRecord record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(PmsProductVerifyRecord record);

    /**
     * update batch
     *
     * @param list the record list
     * @return update count
     */
    int updateBatch(List<PmsProductVerifyRecord> list);

    /**
     * update batch selective
     *
     * @param list the record list
     * @return update count
     */
    int updateBatchSelective(List<PmsProductVerifyRecord> list);

    /**
     * insert batch
     *
     * @param list the record list
     * @return insert count
     */
    int batchInsert(@Param("list") List<PmsProductVerifyRecord> list);
}