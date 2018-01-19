package com.arun.springin5easysteps;

import com.arun.springin5easysteps.UseOfCDI.SomeCDIBusiness;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCDIApplication {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringCDIApplication.class);
        SomeCDIBusiness someCDIBusiness = context.getBean(SomeCDIBusiness.class);
        someCDIBusiness.call();

    }
}

