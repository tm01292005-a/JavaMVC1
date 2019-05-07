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
import org.springframework.context.annotation.Primary;
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
@MapperScan(basePackages = DataConfig1.BASE_PACKAGES, sqlSessionFactoryRef = "sqlSessionFactory1")
public class DataConfig1 {
	public static final String BASE_PACKAGES = "com.example.mybatisdemo.repository.oracle1";
	public static final String MAPPER_XML_PATH = "classpath:com/example/demo/primary/oracle1/*.xml";

	@Primary
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.datasource1")
	public DataSourceProperties datasource1Properties() {
		return new DataSourceProperties();
	}

	@Primary
	@Bean(name = { "datasource1" })
	public DataSource datasource1(@Qualifier("datasource1Properties") DataSourceProperties properties) {
		return properties.initializeDataSourceBuilder().build();
	}

	@Primary
	@Bean(name = { "txManager1" })
	public PlatformTransactionManager txManager1(DataSource dataSource1) {
		return new DataSourceTransactionManager(dataSource1);
	}

	@Bean(name = { "sqlSessionFactory1" })
	@Primary
	public SqlSessionFactory sqlSessionFactory(@Qualifier("datasource1") DataSource datasource1) throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(datasource1);
		// MyBatis のコンフィグレーションファイル
		sqlSessionFactory.setConfigLocation(new ClassPathResource("/mybatis-config.xml"));
		// MyBatis で使用する SQL ファイル群(daoフォルダ内のサブフォルダ内も含んだ全てのxml)
		ResourcePatternResolver resolver = ResourcePatternUtils.getResourcePatternResolver(new DefaultResourceLoader());
		sqlSessionFactory.setMapperLocations(resolver.getResources("classpath:com/**/**/**/**/*.xml"));

		return (SqlSessionFactory) sqlSessionFactory.getObject();
	}
}
