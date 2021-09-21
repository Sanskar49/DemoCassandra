package com.example.CassandraDemoProject.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;


@Configuration
@EnableReactiveCassandraRepositories
public class CassandraReactiveConfig extends AbstractReactiveCassandraConfiguration {

    @Value("${spring.data.cassandra.keyspace-name}")
    String keySpace;

    @Value("${spring.data.cassandra.contact-points}")
    String contactPoints;

    @Override
    protected String getKeyspaceName() {
        return keySpace;
    }


    @Override
    protected String getContactPoints() {
        return contactPoints;
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{"com.example.CassandraDemoProject"};
    }





}
