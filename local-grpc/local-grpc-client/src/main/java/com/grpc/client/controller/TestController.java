package com.grpc.client.controller;

import com.grpc.api.service.HelloGrpc;
import com.grpc.api.service.HelloRequest;
import com.grpc.client.service.HelloService;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author alan.peng
 * @createTime 14 21:12
 * @description
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GrpcClient("grpc-server")
    private HelloGrpc.HelloBlockingStub helloBlockingStub;

    @GetMapping
    public String test(){
        helloBlockingStub.sayHello(HelloRequest.newBuilder().setName("ss").build());
        return "";
    }
}
