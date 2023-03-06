# Data access

Using Panache on top of Hibernate ORM to make it simpler.

Create a Quarkus application with the following extensions

- RestEasy (for accss, not needed for database access)
- `quarkus-hibernate-orm` and `quarkus-hibernate-orm-panache` for Panache and Hibernate
- `quarkus-agroal` for data connection pooling and `quarkus-jdbc-mysql` for the database driver (MySQL in our case)

This is what needs to be done

- Define your Entities like you do within JPA, see for example `Company` and `Employee`.
- For each Entity, create a _Repository_ class that extends from `PanacheRepository`
- Define the transactions using the `@Transaction` CDI annotation. In our case, this is the methods within the JAX-RS resources like `EmployeeResource`
- Within the _application.properties_ file, but this must be environment specific, define the database configuration access parameters and connection pooling settings.
- Optionally but used in this example, define the initial data within the `import.sql` file.

We are using the Repository pattern and not the active record pattern here. The Active record pattern has the problem that the database update logic is written within the Entity classes which is not a good practice of the separation of concerns.

# Original Readme

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/panache-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- Hibernate ORM with Panache ([guide](https://quarkus.io/guides/hibernate-orm-panache)): Simplify your persistence code for Hibernate ORM via the active record or the repository pattern

## Provided Code

### Hibernate ORM

Create your first JPA entity

[Related guide section...](https://quarkus.io/guides/hibernate-orm)

[Related Hibernate with Panache section...](https://quarkus.io/guides/hibernate-orm-panache)

