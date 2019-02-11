# Basic configuration

### Requirements

* docker

```bash
$ docker run -e MONGO_INITDB_ROOT_USERNAME=sa -e MONGO_INITDB_ROOT_PASSWORD=sa -e MONGO_INITDB_DATABASE=health -d -p 27017:27017 mongo
$ docker run --name=test-health -d -p 5432:5432  -e POSTGRES_PASSWORD=sa -e POSTGRES_USER=sa -e POSTGRES_DB=health postgres
```

### Environments

```bash
$ export SQL_DATABASE_DRIVER=org.postgresql.Driver
$ export SQL_DATABASE_URL=jdbc:postgresql://localhost:5432/health
$ export SQL_DATABASE_USERNAME=sa
$ export SQL_DATABASE_PASSWORD=sa
$ export SQL_DATABASE_CHECK=true
```

> NoSql

   - Mongo

```bash
$ export NOSQL_DATABASE_HOSTNAME=localhost
$ export NOSQL_DATABASE_NAME=health
$ export NOSQL_DATABASE_USERNAME=sa
$ export NOSQL_DATABASE_PASSWORD=sa
$ export NOSQL_DATABASE_CHECK=true
```