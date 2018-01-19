package com.arun.springin5easysteps.UseOfCDI;

import javax.inject.Inject;
import javax.inject.Named;

/*
@Component in Spring is similar to @Named in Javax.inject
 */
@Named
public class SomeCDIBusiness {

    @Inject
    private SomeCdiDao someCdiDao;

    public void call() {
        someCdiDao.call();
    }
}
