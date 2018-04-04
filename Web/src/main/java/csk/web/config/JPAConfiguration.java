package csk.web.config;

import org.springframework.context.annotation.AdviceMode;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.inject.Inject;
import javax.persistence.EntityManagerFactory;
import javax.persistence.SharedCacheMode;
import javax.persistence.ValidationMode;
import javax.sql.DataSource;
import java.util.Hashtable;
import java.util.Map;

@EnableAsync(
        mode = AdviceMode.PROXY, proxyTargetClass = false,
        order = 1
)
@EnableTransactionManagement(
        mode = AdviceMode.PROXY, proxyTargetClass = false,
        order = 2
)
public class JPAConfiguration {
    @Inject
    private DataSource dataSource;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
        Map<String, Object> properties = new Hashtable<>();
        properties.put("javax.persistence.schema-generation.database.action",
                "none");
        properties.put("hibernate.ejb.use_class_enhancer", "true");

        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5InnoDBDialect");

        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(adapter);
        factory.setDataSource(this.dataSource);
        factory.setPackagesToScan("csk.entity.database");
        factory.setSharedCacheMode(SharedCacheMode.ENABLE_SELECTIVE);
        factory.setValidationMode(ValidationMode.NONE);
        factory.setJpaPropertyMap(properties);
        return factory;
    }

    /*
     * 基于jpa的事务，存一个以上的事务需要在调用的类上指定具体的事务名称
     * */
    @Bean
    public PlatformTransactionManager jpaTransactionManager(EntityManagerFactory factory) {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(factory);
        jpaTransactionManager.setPersistenceUnitName("MyShop");
        return jpaTransactionManager;
    }

}