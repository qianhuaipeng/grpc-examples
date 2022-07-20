package com.eureka.grpc.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaGrpcClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGrpcClientApplication.class, args);
    }

}
