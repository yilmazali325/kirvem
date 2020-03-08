package com.dinazor.eurekaclient;

import com.dinazor.core.feign.eurekaClient.TestClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController  implements TestClient {

    @RequestMapping("/test")
    public String test(){
        return "Hello Umur";
    }

}
