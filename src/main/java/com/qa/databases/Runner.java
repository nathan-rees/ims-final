package com.qa.databases;
/**
 * just a runner :)
 */
import java.sql.SQLException;
import java.util.ArrayList;

import com.qa.databases.entities.*;
import com.qa.databases.sql.MysqlCustomerDao;
import com.qa.databases.sql.MysqlItemDao;
import com.qa.databases.sql.MysqlOrderDao;
import com.qa.databases.sql.MysqlOrderlineDao;

public class Runner {
	public static void main(String[] args) throws SQLException {
		SetUp s=new SetUp();
		s.intro();
		


	}
}
