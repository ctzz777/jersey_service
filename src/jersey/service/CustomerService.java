/**
 * 
 */
package jersey.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import jersey.bo.Customer;

/**
 * @author ted
 *
 */
public interface CustomerService {
	
	public Customer getCustomer();
	
	public Customer getCustomerByName(@QueryParam("name") String name);
	
	public Customer getCustomerByNamePath(@PathParam("name") String name);
}
