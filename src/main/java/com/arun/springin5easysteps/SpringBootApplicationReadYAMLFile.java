package com.arun.springin5easysteps;

import com.arun.springin5easysteps.config.ReadYAML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApplicationReadYAMLFile {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootApplicationReadYAMLFile.class);
        ReadYAML readYAML = context.getBean(ReadYAML.class);
        System.out.println(readYAML.getUserName());


    }
}
