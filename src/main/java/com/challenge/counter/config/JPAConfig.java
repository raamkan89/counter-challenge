package com.challenge.counter.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * JPAConfig
 * @author ramanjanelu.k
 *
 */
@Configuration
@EnableJpaRepositories(basePackages="com.challenge.counter.*")
@EntityScan(basePackages="com.challenge.*")
@EnableTransactionManagement
public class JPAConfig {

}
