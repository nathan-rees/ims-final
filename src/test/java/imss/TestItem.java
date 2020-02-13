package imss;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.databases.entities.Item;

public class TestItem {

	@Test
	public void test() {
	Item item=new Item(1,"strong",69);	
	assertNotNull(item);
	item.setCost(2);
	item.setId(2);
	item.getCost();
	

	assertEquals(2,item.getId());
	item.getProductName();
	
	item.setProductName("");
	}

}
