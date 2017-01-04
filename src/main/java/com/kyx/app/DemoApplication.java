package com.kyx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
public class DemoApplication {

//	@Bean
//	public FilterRegistrationBean get() {
//		SessionFilter sessionFilter = new SessionFilter();
//		return new FilterRegistrationBean(sessionFilter);
//	}
//	@Bean
//	public ServletRegistrationBean servletRegistrationBean(){
//		return new ServletRegistrationBean(new MyServlet(),"/lottery/go");
//	}
//	@Bean
//	public ServletListenerRegistrationBean servletListenerRegistrationBean(){
//		return new ServletListenerRegistrationBean(new MyServletListener());
//	}
//	@Bean
//	public Filter sessionFilter(){
//		SessionFilter sessionFilter = new SessionFilter();
//		return  sessionFilter;
//	}

	public static void main(String[] args) {
			System.setProperty("spring.devtools.restart.enabled", "true");
			SpringApplication.run(DemoApplication.class, args);
	}
}
