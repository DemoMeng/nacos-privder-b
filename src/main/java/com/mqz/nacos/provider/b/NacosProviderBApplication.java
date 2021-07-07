package com.mqz.nacos.provider.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(value = {"com.mqz"})//需要扫描到底层包mars项目
public class NacosProviderBApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderBApplication.class, args);
    }

}
