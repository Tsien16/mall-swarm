package com.tsien.mall.mbg.dao.ums;

import com.tsien.mall.mbg.domain.model.ums.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/11 0011 0:16
 */

public interface UmsPermissionMapper {
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
    int insert(UmsPermission record);

    /**
     * insert or update record to table
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdate(UmsPermission record);

    /**
     * insert or update record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertOrUpdateSelective(UmsPermission record);

    /**
     * insert record to table selective
     *
     * @param record the record
     * @return insert count
     */
    int insertSelective(UmsPermission record);

    /**
     * select by primary key
     *
     * @param id primary key
     * @return object by primary key
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     * update record selective
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     * update record
     *
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(UmsPermission record);

    /**
     * update batch
     *
     * @param list the record list
     * @return update count
     */
    int updateBatch(List<UmsPermission> list);

    /**
     * update batch selective
     *
     * @param list the record list
     * @return update count
     */
    int updateBatchSelective(List<UmsPermission> list);

    /**
     * insert batch
     *
     * @param list the record list
     * @return insert count
     */
    int batchInsert(@Param("list") List<UmsPermission> list);
}