package com.example.mybatisdemo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * SqlSessionFactoryBean格納クラス
 */
@Configuration
@MapperScan(basePackages = { "com.example.mybatisdemo.repository.postgres" }, sqlSessionFactoryRef = "sqlSessionFactory3")
public class DataConfig3 {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.datasource3")
	public DataSourceProperties datasource3Properties() {
		return new DataSourceProperties();
	}

	@Bean(name = { "datasource3" })
	public DataSource datasource3(@Qualifier("datasource3Properties") DataSourceProperties properties) {
		return properties.initializeDataSourceBuilder().build();
	}

	@Bean(name = { "txManager3" })
	public PlatformTransactionManager txManager3(DataSource datasource3) {
		return new DataSourceTransactionManager(datasource3);
	}

	@Bean(name = { "sqlSessionFactory3" })
	public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource3") DataSource datasource3) throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(datasource3);
		// MyBatis のコンフィグレーションファイル
		sqlSessionFactory.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
		// MyBatis で使用する SQL ファイル群(daoフォルダ内のサブフォルダ内も含んだ全てのxml)
		ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
		sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:com/**/**/**/**/*.xml"));

		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
}
