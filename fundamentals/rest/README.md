# JAX-RS Demo

JAX-RS, a Jakarta EE API specification that provides support in creating web services according to the Representational State Transfer architectural pattern. (REST)

Mostly used as calling remote methods (RPC) using JSON as data format.

The demo is using RESTEasy and a JSON provider (JSON-B in this example) to provide this functionality (through extensions) in combination with Quarkus.

## Hello

- Creating GET Endpoint and mapping to Java Method
- Path and Query Parameters

Build and test the project

```Shell
mvn clean quarkus:dev
```

Testing

```Shell
curl 'localhost:8080/hello'
```

Testing with Path and Query parameters

```Shell
curl 'localhost:8080/hello/MicroStream?language=en'
```

See `E0HelloResource`.

## JSON Support

- The JSONB support (JSON Binding - automatic converting between Java and JSON) is provided through an extension.
- Use appropriate Media Types
- The JSONP support (JSON Processing - Programmatic reading and writing JSON) is integrated.  ??? TODO Test out if this is also for Jackson ????
- POST type of endpoints.

Testing

```Shell
curl 'localhost:8080/person'

curl -X POST localhost:8080/person -H 'Content-Type: application/json' -d '{"age":24,"name":"John Doe"}'  

curl 'localhost:8080/jsonp'
```

See `E1JSONBResource` and `E2JSONPResource`.

## Define Response Status

- Use _Response Builder_ to define the status

```Shell
curl 'localhost:8080/evenValue/4'

curl -v 'localhost:8080/rest/api/evenValue/5'
```

See `E3ResponseResource`.
