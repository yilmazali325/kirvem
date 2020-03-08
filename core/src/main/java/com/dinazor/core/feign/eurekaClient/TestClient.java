package com.dinazor.core.feign.eurekaClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("eureka-test-client")
public interface TestClient {

    @RequestMapping("/test")
    String test();
}
