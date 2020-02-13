package imss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.databases.entities.Item;

public class TestItem {

	@Test
	public void test() {
	Item item=new Item(1,"strong",69);	
	assertNotNull(item);
	item.getCost();
	item.getId();
	item.getProductName();
	item.setCost(2);
	item.setId(2);
	item.setProductName("");
	}

}
