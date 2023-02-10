
# Quarkus Fundamentals


In this online course, you get an introduction to developing modern cloud-native microservices with Quarkus.


This is an introductory workshop on Quarkus, a Kubernative Java Native solution for HotSpot and GraalVM, combining the best-of-breed libraries for creating your application.

Step-by-step instructions will be provided on how to get started with Quarkus. In the end, attendees will learn examples of the different features such as starting a new application, using the developer Mode, configuring, running it in containers, and so on ...



## Create application

There are 2 ways of creating a new Quarkus application, one is using the CLI and the other one is the Quarkus code website.

When you like to use the command line, there are several options.

1. Use the Quarkus CLI tool, a tool that you can use to create and adapt your Quarkus application.  It is currently in preview and you cannot specify every specific option that you might want to define when you start your project (like defining the JDK version). Have a look at https://quarkus.io/guides/cli-tooling for the installation process of the CLI tool.

2. Use the Quarkus Maven plugin to create a Maven-based (or Gradle based, the Maven plugin will create a Gradle project) Quarkus application. Many options can be defined but this way is not very handy (unless you have a script that repeatedly created the same project that is unlikely what is needed)

The easiest way is to use the website https://code.quarkus.io/ to specify the options and create your initial project.

For this fundamentals course, make sure you add the _"RESTEasy Classic"_ and _"RESTEasy Classic JSON-B"_ extensions as that will be the basis for our demo applications.

## REST support

An example providing support for REST endpoints is shown within the demo application that can be found in the _rest_ directory. Also, have a look at the README file in that directory for more info.

