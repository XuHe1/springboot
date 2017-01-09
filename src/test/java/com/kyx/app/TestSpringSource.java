package com.kyx.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by XuHe on 17/1/6.
 */

public class TestSpringSource  implements InitializingBean{
    Logger logger = LoggerFactory.getLogger(TestSpringSource.class);
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("you have set the property version: ",this.version);
    }

    public static void main(String[] args) {
        TestSpringSource test = new TestSpringSource();
        test.setVersion("1.0");
    }
}
