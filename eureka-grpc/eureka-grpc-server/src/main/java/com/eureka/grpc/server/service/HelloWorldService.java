package com.eureka.grpc.server.service;

import com.grpc.api.service.HelloGrpc;
import com.grpc.api.service.HelloRequest;
import com.grpc.api.service.HelloResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @author alan.peng
 * @createTime 12 21:18
 * @description
 */
@GrpcService
public class HelloWorldService extends HelloGrpc.HelloImplBase {

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse helloResponse = HelloResponse.newBuilder()
                .setMessage("我是业主小安，爱吃小熊饼干")
                .build();
        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();
        System.out.println("收到消息：" + request.getName());
    }
}
