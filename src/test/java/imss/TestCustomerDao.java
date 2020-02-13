package imss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.databases.entities.Customer;
import com.qa.databases.sql.MysqlCustomerDao;

public class TestCustomerDao {

	@Test
	public void test() {
		Customer customer=new Customer((long)3,"s","s","s");
		MysqlCustomerDao d=new MysqlCustomerDao("noobb");
		d.create(customer);
		d.readAll();
		d.update(customer);
		d.delete(customer);
		
		
	}

}
