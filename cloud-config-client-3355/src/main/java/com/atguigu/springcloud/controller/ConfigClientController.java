package com.atguigu.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新增@RefreshScope 配合配置文件增暴露监控端点
 * 然后运维工程师 发送post请求
 * curl -X POST "http://localhost:3355/actuator/refresh"
 * 能实现github修改后，不重启服务，也能访问到
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
