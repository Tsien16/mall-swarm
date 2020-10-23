package com.tsien.mall.auth.controller;

import com.tsien.mall.common.util.ServerResponse;
import com.tsien.mall.mbg.dao.cms.CmsSubjectMapper;
import com.tsien.mall.mbg.domain.model.cms.CmsSubject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/12 0012 18:15
 */

@RestController
@RequestMapping("/test")
@Api("测试类")
public class TestController {

    @Resource
    private CmsSubjectMapper cmsSubjectMapper;

    @GetMapping("/test")
    @SuppressWarnings("rawtypes")
    @ApiOperation("测试方法")
    public ServerResponse test() {
        CmsSubject cmsSubject = cmsSubjectMapper.selectByPrimaryKey(1L);
        return ServerResponse.success(cmsSubject);
    }

}
