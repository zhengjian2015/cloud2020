package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBalancer {

    //接收所有服务，返回某个服务
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
