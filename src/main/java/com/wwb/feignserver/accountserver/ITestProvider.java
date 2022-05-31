package com.wwb.feignserver.accountserver;

import com.wwb.commonbase.utils.response.ResponseResult;
import com.wwb.feignserver.accountserver.entity.request.TestRequest;
import com.wwb.feignserver.accountserver.entity.response.TestResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author weibo
 * @date 2022/3/7
 */

@org.springframework.cloud.openfeign.FeignClient("ACCOUNT-SERVER")
public interface ITestProvider {

    /**
     * 测试接口
     * @param testRequest
     * @return
     */
    @RequestMapping(value = {"/api/account/testProvider"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    ResponseResult<TestResponse> testProvider(@RequestBody TestRequest testRequest);



}
