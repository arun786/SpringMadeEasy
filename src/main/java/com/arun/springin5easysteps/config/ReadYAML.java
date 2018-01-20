package com.arun.springin5easysteps.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadYAML {

    @Value("${spring.data.name}")
    private String username;

    public String getUserName() {
        return username;
    }
}
