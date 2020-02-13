package imss;

import org.junit.Test;

import com.qa.databases.sql.MysqlOrderlineDao;

public class TestOrderlineDao {

	@Test
	public void test() {
		MysqlOrderlineDao dao=new MysqlOrderlineDao("noobb",1,1,1);
		dao.create(2);
		dao.readAll();
		dao.update(2);
		dao.delete(2);
		
		
	}

}
