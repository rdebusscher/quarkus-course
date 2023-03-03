# Configuration Demo

Using configuration with Quarkus by using MicroProfile Config.

Testing

```Shell
mvn quarkus:dev
```


## E0 - Injected

MicroProfile Config allows you to inject configuration values as if they are CDI beans.

See `0Resource`

```Shell
curl 'localhost:8080/config/injected'
```

## E1 - Configuration source

Several configuration sources are supported. Each having a different priority.  For example, you can override defauts fro mcode or application.properties by system properties and environment variables.

```Shell
curl 'localhost:8080/config-sources'
```

Also try the above endpoint when started as

```Shell
mvn quarkus:dev -Dconfig.key=overruled
```

## E2 - Converters

There are many default converters that convert the property value from a String to the Java type.

```Shell
curl 'localhost:8080/converted'
```

## E3 - placeholders resolved

The configuration values can have place holders that are resolved from other configuration keys.

```Shell
curl 'localhost:8080/complex'
```


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

You can then execute your native executable with: `./target/rest-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Related Guides

- RESTEasy Classic JSON-B ([guide](https://quarkus.io/guides/rest-json)): JSON-B serialization support for RESTEasy Classic

## Provided Code

### RESTEasy JAX-RS

Easily start your RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started#the-jax-rs-resources)
