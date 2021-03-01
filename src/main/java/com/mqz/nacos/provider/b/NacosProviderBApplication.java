package com.mqz.nacos.provider.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderBApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderBApplication.class, args);
    }

}
