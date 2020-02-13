package imss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.databases.entities.Customer;

public class TestCustomer {

	@Test
	public void test() {
		Customer customer=new Customer((long)3,"","","");
		assertNotNull(customer);
		customer.getEmail();
		customer.getFirstname();
		customer.getId();
		customer.getEmail();
		customer.getSurname();
		customer.setEmail("");
		customer.setFirstname("");
		customer.setId((long) 2);
		customer.setSurname("");
	}

}
