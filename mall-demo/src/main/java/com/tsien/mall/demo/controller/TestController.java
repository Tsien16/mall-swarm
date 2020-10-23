package com.tsien.mall.demo.controller;

import com.tsien.mall.common.util.ServerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author tsien
 * @version 1.0.0
 * @date 2020/10/13 0013 15:59
 */

@RestController
public class TestController {

    /**
     * 测试类
     *
     * @return ServerResponse
     */
    @GetMapping("/get")
    @SuppressWarnings("rawtypes")
    public ServerResponse get() {
        return ServerResponse.success("成功");
    }

}
