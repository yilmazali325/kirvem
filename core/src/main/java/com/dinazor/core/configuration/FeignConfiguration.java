package com.dinazor.core.configuration;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = {
        "com.dinazor.core.feign.eurekaClient"})
public class FeignConfiguration {
}
