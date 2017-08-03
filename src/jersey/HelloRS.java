/**
 * 
 */
package jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



/**
 * @author ted
 *
 */
@Path("/hello")
public class HelloRS {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
    public Hello sayHelloWorld() {
		Hello hello = new Hello();
		hello.setName("Fuck");
		hello.setPrice(20.9);
        return hello;
    }   
 
    @GET
    @Path("/{name}")
    @Produces(MediaType.APPLICATION_XML)
    public Hello sayHello(@PathParam("name") String name) {
    	Hello hello = new Hello();
		hello.setName(name);
		hello.setPrice(100.11);
        return hello;
    }
    
}
