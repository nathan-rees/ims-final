package imss;


import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.qa.databases.SetUp;
import com.qa.databases.sql.MysqlCustomerDao;

public class TestSetUp {

	@Test
	public void test() {
		SetUp d=new SetUp();
		
		assertNotNull(d);	
		
		
	}
	

}
