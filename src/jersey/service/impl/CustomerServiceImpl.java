/**
 * 
 */
package jersey.service.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jersey.bo.Customer;
import jersey.service.CustomerService;

/**
 * @author ted
 *
 */
@Path("customer") 
public class CustomerServiceImpl implements CustomerService {

	/* (non-Javadoc)
	 * @see cxf.service.CustomerService#getCustomer()
	 */
	@Override
	@GET  
    @Path("/get")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(1L);
		customer.setName("CTzz");
		customer.setAge(23);
		return customer;
	}

	@Override
	@GET  
    @Path("/getByName")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomerByName(String name) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(2L);
		customer.setName(name);
		customer.setAge(23);
		return customer;
	}

	@Override
	@GET  
    @Path("/get/{name}")  
    @Produces(MediaType.APPLICATION_JSON) 
	public Customer getCustomerByNamePath(String name) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setSeqNo(3L);
		customer.setName(name);
		customer.setAge(23);
		return customer;
	}

}
