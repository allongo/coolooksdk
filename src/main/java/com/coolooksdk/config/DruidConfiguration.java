package com.coolooksdk.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import javax.sql.DataSource;
import java.sql.SQLException;



/**
 * Created by mingle on 2018/5/8.
 */
@Configuration
public class DruidConfiguration {
    @Bean
    //统一配置名前缀，可以减少上面配置代码
    @ConfigurationProperties(prefix = "spring.datasource")
    @Primary
    public DruidDataSource dataSource() throws SQLException {
        DruidDataSource datasource = new DruidDataSource();
        /*datasource.setUrl(this.dbUrl);
        datasource.setUsername(username);
        datasource.setPassword(password);
        datasource.setDriverClassName(driverClassName);

        //configuration
        datasource.setInitialSize(initialSize);
        datasource.setMinIdle(minIdle);
        datasource.setMaxActive(maxActive);
        datasource.setMaxWait(maxWait);
        datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        datasource.setValidationQuery(validationQuery);
        datasource.setTestWhileIdle(testWhileIdle);
        datasource.setTestOnBorrow(testOnBorrow);
        datasource.setTestOnReturn(testOnReturn);
        datasource.setPoolPreparedStatements(poolPreparedStatements);    datasource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        datasource.setFilters(filters);*/
        return datasource;
    }

    @Bean
    public DataSourceTransactionManager transactionManager() throws SQLException {
        return new DataSourceTransactionManager(dataSource());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setDataSource(dataSource);
        /*sessionFactory.setMapperLocations(resolver.getResources("classpath:mapper*//*.xml"));*/
        /*Interceptor interceptor = new PageInterceptor();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true");
        properties.setProperty("supportMethodsArguments", "true");
        properties.setProperty("returnPageInfo", "check");
        properties.setProperty("params", "count=countSql");
        interceptor.setProperties(properties);
        sessionFactory.setPlugins(new Interceptor[]{interceptor});*/

        return sessionFactory.getObject();
    }
}
