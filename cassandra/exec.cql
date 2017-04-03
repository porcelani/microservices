CREATE KEYSPACE IF NOT EXISTS mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3};

CREATE TABLE IF NOT EXISTS mykeyspace.customer (id TimeUUID, firstname text, lastname text, PRIMARY KEY (id));
