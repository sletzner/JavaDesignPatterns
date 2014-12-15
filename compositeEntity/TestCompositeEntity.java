/**
 * 
 */
package fr.letzner.patterns.compositeEntity;

/**
 * @author Stefan Letzner
 * 
 */
public class TestCompositeEntity {

	public static void test() {
		Client client = new Client();
		
		client.setData("Test", "Data");
		client.printData();
		
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
