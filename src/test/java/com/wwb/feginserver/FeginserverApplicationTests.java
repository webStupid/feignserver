//package com.wwb.feginserver;
//
//import com.wwb.commonbase.utils.response.ResponseResult;
//import com.wwb.feignserver.accountserver.ITestProvider;
//import com.wwb.feignserver.accountserver.entity.request.TestRequest;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//class FeginserverApplicationTests {
//
//
//    @Autowired
//    private ITestProvider testProvider;
//
//    @Test
//    void contextLoads() {
//        TestRequest request = new TestRequest();
//        request.setName("23456789");
//       ResponseResult responseResult =  testProvider.testProvider(request);
//        System.out.println(responseResult);
//    }
//
//}
