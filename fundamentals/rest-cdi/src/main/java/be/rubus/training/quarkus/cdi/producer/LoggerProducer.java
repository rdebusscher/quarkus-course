package be.rubus.training.quarkus.cdi.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggerProducer {

    @Produces
    Logger getLog(InjectionPoint ip) {
        // Inspect the Injection point to make
        Class<?> declaringClass = ip.getMember().getDeclaringClass();
        return LoggerFactory.getLogger(declaringClass);
    }
}
