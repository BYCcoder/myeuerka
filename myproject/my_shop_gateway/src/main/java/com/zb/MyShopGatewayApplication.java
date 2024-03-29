package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class MyShopGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyShopGatewayApplication.class, args);
    }

}
