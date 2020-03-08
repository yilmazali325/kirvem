package com.dinazor.core.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.dinazor.core"
})
public class CoreConfiguration {
}
