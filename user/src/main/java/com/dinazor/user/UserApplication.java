package com.dinazor.user;

import com.dinazor.core.configuration.IncludeCoreConfiguration;
import com.dinazor.core.feign.eurekaClient.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@IncludeCoreConfiguration
//@EnableFeignClients(basePackages = "com.dinazor.core.feign.eurekaClient")
@EnableDiscoveryClient
@EnableJpaRepositories(basePackages = "com.dinazor.user.repository")
@Configuration
@SpringBootApplication
public class UserApplication {


    @Autowired
    private TestClient testClient;

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}

