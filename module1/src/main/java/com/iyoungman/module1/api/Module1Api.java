package com.iyoungman.module1.api;

import com.iyoungman.module1.service.Module1Service;

/**
 * Created by iyoungman on 2020-04-30.
 */

public class Module1Api {

    private Module1Service module1Service = new Module1Service();

    public void method() {
        module1Service.method();
    }

}
