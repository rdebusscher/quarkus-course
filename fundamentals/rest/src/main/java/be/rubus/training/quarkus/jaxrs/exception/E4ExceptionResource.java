package be.rubus.training.quarkus.jaxrs.exception;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/exception")
public class E4ExceptionResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{value}")
    public String doGreeting(@PathParam("value") Integer someValue) {
        throw new MyErrorException(someValue);
    }
}
