package com.arun.springin5easysteps.UseOfCDI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;

/*
Instead of using @Component we can use @Named
 */
@Named
public class SomeCdiDao {

    Logger logger = LoggerFactory.getLogger(SomeCdiDao.class);

    public SomeCdiDao() {
        logger.info("Some Cdi Dao...");
    }

    public void call() {
        logger.info("Some Cdi dao called from function call...");
    }
}
