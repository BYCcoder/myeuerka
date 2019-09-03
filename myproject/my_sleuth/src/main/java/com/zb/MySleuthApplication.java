package com.zb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class MySleuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySleuthApplication.class, args);
    }

}
