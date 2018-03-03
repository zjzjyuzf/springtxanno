package com.yuzf.config;

import java.beans.PropertyVetoException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.yuzf.dao.TxDao;
import com.yuzf.service.TxService;

@Configuration
@ComponentScan(basePackageClasses = {TxDao.class,TxService.class})
//@EnableAspectJAutoProxy    //自动切面
@EnableTransactionManagement   //开启事务
public class SpringConfig {

	@Bean
	public ComboPooledDataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass("com.mysql.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUser("root");
		dataSource.setPassword("yuzf");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() throws Exception {
		return new JdbcTemplate(dataSource());
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() throws Exception {
		return new DataSourceTransactionManager(dataSource());
	}
}
