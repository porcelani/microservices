CREATE KEYSPACE IF NOT EXISTS mykeyspace WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 3};
CREATE TABLE IF NOT EXISTS mykeyspace.password (passwordCharacters text, score int, complexity text, PRIMARY KEY (passwordCharacters));
