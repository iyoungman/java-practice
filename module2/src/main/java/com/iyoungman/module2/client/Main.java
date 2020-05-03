package com.iyoungman.module2.client;

import com.iyoungman.module1.api.Module1Api;
import org.apache.http.client.HttpClient;

/**
 * Created by iyoungman on 2020-05-03.
 */

public class Main {

    public static void main(String[] args) {
        Module1Api api = new Module1Api();
        api.method();
    }

}
