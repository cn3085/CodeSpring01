package org.zerock.config;


import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.TransactionIsolationLevel;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages= {"org.zerock.sample"})
@MapperScan(basePackages= {"org.zerock.mapper"})
public class RootConfig {

	@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
//		hikariConfig.setJdbcUrl("jdbc:mysql://localhost:3306/book_ex")
		;
//		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
//		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://localhost:3306/book_ex");
//		hikariConfig.setUsername("book_ex");
//		hikariConfig.setPassword("book_ex");

		hikariConfig.setDriverClassName("net.sf.log4jdbc.sql.jdbcapi.DriverSpy");
//		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://mysql.cfjfk3ftmgo9.ap-northeast-2.rds.amazonaws.com/openproject?characterEncoding=utf8");
//		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://mysql.cfjfk3ftmgo9.ap-northeast-2.rds.amazonaws.com?characterEncoding=utf8");
		hikariConfig.setJdbcUrl("jdbc:log4jdbc:mysql://mysql.cfjfk3ftmgo9.ap-northeast-2.rds.amazonaws.com");
		hikariConfig.setUsername("bit");
		hikariConfig.setPassword("bit");
		
		HikariDataSource dataSource = new HikariDataSource(hikariConfig);
		
		return dataSource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(dataSource());
		return (SqlSessionFactory) sqlSessionFactory.getObject();
		
	}
}
