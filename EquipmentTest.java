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
	
	public final String strg = "SmartWatch/5,3.78,9380.99,gives an extra life";
	
	public void testEquipment() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		
		Assert.assertEquals("SmartWatch" , equipment.getName());
		Assert.assertEquals(5, equipment.getCount());
		Assert.assertEquals(3.78, equipment.getTotalWeight(), 0.01);
		Assert.assertEquals(9380.99, equipment.getTotalPrice(), 0.01);
		
	}
	
	public void testGetName() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		String expected = "SmartWatch";
		String actual = equipment.getName();
		
		Assert.assertEquals(expected, actual);
	}

	public void testGetCount() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		int expected = 5;
		int actual = equipment.getCount();
		
		Assert.assertEquals(expected, actual);
	}

	public void testGetTotalWeight() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		double expected = 3.78;
		double actual = equipment.getTotalWeight();
		
		Assert.assertEquals(expected, actual, 0.000001);
	}

	public void testGetTotalPrice() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		double expected = 9380.99;
		double actual = equipment.getTotalPrice();
		
		Assert.assertEquals(expected, actual, 0.01);
	}

	public void testGetDescription() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		String expected = "gives an extra life";
		String actual = equipment.getDescription();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void testToString() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		String expected = "Name: SmartWatch, Number: 5, Weight: 3.78 lbs, Price: $9380.99 - gives an extra life";
		String actual = equipment.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void testEqualsObject() throws AssertException 
	{
		Equipment equipment = new Equipment(strg);
		Equipment equipment1 = new Equipment("OldWatch/5,3.78,9380.99,gives an extra life");
		Equipment equipment2 = new Equipment("SmartWatch/5,3.78,9380.99,gives an extra life");
		
		Assert.assertEquals(true, equipment.equals(equipment));
		Assert.assertEquals(false, equipment.equals(equipment1));
		Assert.assertEquals(true, equipment.equals(equipment2));
	}
}