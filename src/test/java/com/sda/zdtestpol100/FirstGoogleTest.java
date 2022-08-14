package com.sda.zdtestpol100;

import org.junit.jupiter.api.Test;

public class FirstGoogleTest extends WebDriverManager {

    private static String GOOGLE_URL = "https://www.google.com/";

    @Test
    public void firstTestInGoogle() throws InterruptedException {
        startDriver();
        DRIVER.get(GOOGLE_URL);
        Thread.sleep(10000);
        destroyDriver();
    }

}
