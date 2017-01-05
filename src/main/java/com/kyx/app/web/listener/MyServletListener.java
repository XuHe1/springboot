package com.kyx.app.web.listener;

import com.kyx.app.web.servlet.MyServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by kaiitsugyou on 16/12/30.
 */
@WebListener
public class MyServletListener implements ServletContextListener {
    Logger logger = LoggerFactory.getLogger(MyServlet.class);
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        logger.info("================>context init.....");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
