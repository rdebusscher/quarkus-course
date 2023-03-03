# CDI Demo

Some examples of using CDI API in combination with Quarkus.

## E0 - Integration

Using a CDI application scoped service within a Rest endpoint. See `E0IntegrationResource`

```Shell
curl 'localhost:8080/cdi/MicroStream?language=de'
```

## E1 - Qualifiers

Using multiple implementations of an interface and inject a specific implementation using a qualifier.

See `E1PaymentResource`

```Shell
curl 'localhost:8080/pay/15?paymentType=CREDIT_CARD'
```


## E1 - Inject Any Instance

Alternative for the qualifier example by injecting all implementations of an interface and select the one that is needed.

See `E1BisPaymentResource`

```Shell
curl 'localhost:8080/pay-v2/15?paymentType=CREDIT_CARD'
```

## E3 Producing CDI beans

CDI Beans can be produced if they need more complex initialisation.

See `E03ProducerResource`

```Shell
curl -X POST localhost:8080/log  -d '{"age":42,"name":"John Doe"}'
```

## E4 Initializing service

A CDI bean can perform some initialization by annotating a method with @PostConstruct. This is especially handy when no other dependencies are injected and no constructor is written.

See `E4InitResource`

```Shell
curl localhost:8080/init
```

# Interceptor

With in interceptor, you can intercept the execution of any CDI method. T_You have the opportunity to alter te parameters and the return value.

See `E5InterceptorResource`

```
curl localhost:8080/timing/fast
curl localhost:8080/timing/slow
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
