package imss;

import org.junit.Test;

import com.qa.databases.entities.Item;
import com.qa.databases.sql.MysqlItemDao;

public class TestItemDao {

	@Test
	public void test() {
		Item item=new Item(0, "noobb", 0);
		MysqlItemDao dao=new MysqlItemDao("noobb");
		dao.readAll();
		dao.create(item);
		dao.update(item);
		dao.delete(item);
		
	}

}
