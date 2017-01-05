package com.kyx.app;

import com.kyx.app.spring.conf.AppConf;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@ServletComponentScan
@MapperScan(basePackages = "com.kyx.app.mybatis.mapper")
public class DemoApplication {

	private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@Autowired
	private AppConf appConf;

//	@Value("${mybatis.mapperLocations}")
//	private String mapperLocations;
//	@Value("${mybatis.typeAliasPackage}")
//	private String typeAliasPackage;

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
	@Bean
	@ConfigurationProperties(prefix = "spring.dataSource")
	public DataSource dataSource(){
		return new HikariDataSource();
	}


	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
			SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(dataSource());
			// 使用xml,必须
//			logger.info("=======>application.properties: {}",mapperLocations);
//			logger.info("=======>application.properties: {}",typeAliasPackage);

			sessionFactory.setTypeAliasesPackage(appConf.getTypeAliasPackage());
			sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(appConf.getMapperLocations()));
			return sessionFactory.getObject();
	}

	public static void main(String[] args) {
			System.setProperty("spring.devtools.restart.enabled", "true");
			SpringApplication.run(DemoApplication.class, args);
	}
}
