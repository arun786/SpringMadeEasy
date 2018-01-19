package com.arun.springin5easysteps;

import com.arun.springin5easysteps.Scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringApplicationScope {

    private static Logger logger = LoggerFactory.getLogger(SpringApplicationScope.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringApplicationScope.class);
        PersonDAO p1 = context.getBean(PersonDAO.class);
        PersonDAO p2 = context.getBean(PersonDAO.class);

        logger.info("{}", p1);
        logger.info("{}", p1.getJdbcConnection());
        logger.info("{}", p2);
        logger.info("{}", p2.getJdbcConnection());


    }
}
