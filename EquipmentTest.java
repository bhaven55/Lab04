/**
 * Testing class for Product object
 *
 * @author Bhaven Patel
 * @version 2019-02-09
 */
public class EquipmentTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	
	public final String strg = "SmartWatch/5,3.0078,9380.99,gives an extra life";
	
	public void testEquipment() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		
		Assert.assertEquals("SmartWatch" , equipment.getName());
		Assert.assertEquals(5, equipment.getCount());
		Assert.assertEquals(3.0078, equipment.getTotalWeight(), 0.01);
		Assert.assertEquals(9380.99, equipment.getTotalPrice(), 0.01);
		
	}
}