package com.dmitry.web.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;

import javax.sql.DataSource;


@Configuration
@ComponentScan("com.dmitry")
public class DbConfig {
//    @Bean
//    public DataSource getDataSourse() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/Lessons?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
//        dataSource.setUsername("root");
//        dataSource.setPassword("123qwe");
//        return dataSource;
//    }

//    @Bean
//    DataSource dataSource() {
//        return new EmbeddedDatabaseBuilder()
//                .setType(EmbeddedDatabaseType.H2).addScript("classpath:myScript.sql").build();
//    }

//    @Bean
//    public BasicDataSource dataSource(){
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        basicDataSource.setUrl("jdbc:mysql://localhost:3306/Lessons?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
//        basicDataSource.setUsername("root");
//        basicDataSource.setPassword("123qwe");
//        basicDataSource.setInitialSize(5);
//        basicDataSource.setMaxActive(10);
//
//        return basicDataSource;
//    }
    @Bean
    public JndiObjectFactoryBean dataSourse() {
        JndiObjectFactoryBean dataSourse = new JndiObjectFactoryBean();
        dataSourse.setJndiName("jdbc/testDB");
        dataSourse.setResourceRef(true);
        dataSourse.setProxyInterface(DataSource.class);
        return dataSourse;
    }

    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
        return new NamedParameterJdbcTemplate(dataSource);
    }

}
