package imss;

import org.junit.Test;

import com.qa.databases.entities.Customer;
import com.qa.databases.sql.MysqlOrderDao;

public class TestOrderDao {

	@Test
	public void test() {
		Customer c=new Customer((long)2,"","","");
		MysqlOrderDao dao=new MysqlOrderDao("noobb");
		dao.create(c);
		dao.update(c);
		dao.delete(c);
		dao.readAll();
		
	}

}
