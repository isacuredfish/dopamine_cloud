package com.dopamine.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenzi.ma
 * @date 2023/04/26 14:09
 * 模拟请求，为节省时间，跳过crud代码
 **/
@RestController
@Slf4j
public class PaymentController {

    @PostMapping
    public String getPayment(){
        log.info("开始查询---查询完成");
        return "查询成功";
    }

    @PostMapping
    public String createPayment(){
        log.info("开始添加---添加完成");
        return "添加成功";
    }
}
