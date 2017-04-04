package com.porcelani.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.List;

import static java.util.Arrays.asList;

@Configuration
@EnableAutoConfiguration
class CassandraConfiguration {

    @Configuration
    @EnableCassandraRepositories
    static class CassandraConfig extends AbstractCassandraConfiguration {
        @Value("${spring.data.cassandra.keyspace-name}")
        private String keyspaceName;

        @Value("${spring.data.cassandra.contact-points}")
        private String contactPoints;


        public String getContactPoints() {
            return contactPoints;
        }

        @Override
        public String getKeyspaceName() {
            return keyspaceName;
        }

        @Override
        protected List<String> getStartupScripts() {
            String createKeyspace = "CREATE KEYSPACE IF NOT EXISTS mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3};";
            String createTable = "CREATE TABLE IF NOT EXISTS mykeyspace.password (password text, score int, complexity text;";

            return asList(createKeyspace, createTable);
        }

        @Override
        public SchemaAction getSchemaAction() {
            return SchemaAction.RECREATE;
        }
    }
}