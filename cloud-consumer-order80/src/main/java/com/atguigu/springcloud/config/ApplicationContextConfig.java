package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/***
 *
 * @Configuation加载Spring方法
 * @Configuration配置spring并启动spring容器
 * @Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)
 *
 * @Configuation总结
 *  @Configuation等价于<Beans></Beans>
 *
 *  @Bean等价于<Bean></Bean>
 *
 *  @ComponentScan等价于<context:component-scan base-package=”com.dxz.demo”/>
 * ————————————————
 * 版权声明：本文为CSDN博主「千羽公子」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/BinshaoNo_1/article/details/85005935
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced //赋予了负载均衡的能力，否则地址端口不写死会报错
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
//applicationContext.xml <bean id="" class="">
