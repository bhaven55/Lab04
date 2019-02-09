/**
 * Testing class for Product object
 *
 * @author Bhaven Patel
 * @version 2019-02-09
 */
public class ZooTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	
	public final int initialCapacity = 5;
	
	public void testZoo() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		
		Assert.assertEquals(5,  zoo.getAnimals().length);
		Assert.assertEquals(5, zoo.getCapacity());
	}
	
	public void testAddAnimal() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		
		Animal[] array = new Animal[25];
		array[0] = new Animal("Black and White" , "Panda" , 867, 6.0);
		
		Animal[] array2 = zoo.getAnimals();
		
		boolean actual = array[0].equals(array2[0]);
		
		Assert.assertEquals(true, actual);
	}
	
	public void testGetTotalHeight() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		
		double expected = 16.0;
		double actual = zoo.getTotalHeight();
		
		Assert.assertEquals(expected, actual, 0.01);
	}
	
	public void testGetAverageWeight() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		
		double expected = 383.0;
		double actual = zoo.getAverageWeight();
		
		Assert.assertEquals(expected, actual, 0.01);
	}
	
	public void testGetAverageWeightString() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		zoo.addAnimal(new Animal("Red" , "Snake" , 45, 11.0));
		
		double expected = 51.0;
		double actual = zoo.getAverageWeight("Red");
		
		Assert.assertEquals(expected, actual, 0.01);
	}
	
	public void testGetAnimals() throws AssertException 
	{
		Animal[] zoo = new Animal[25];
		zoo[0] = new Animal("Black and White" , "Panda" , 867, 6.0);
		zoo[1] = new Animal("Red" , "Monkey" , 57, 3.0);
		zoo[2] = new Animal("Black" , "Bear" , 225, 7.0);
		zoo[3] = new Animal("Red" , "Snake" , 45, 11.0);
		
		Zoo zoo1 = new Zoo(initialCapacity);
		zoo1.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo1.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo1.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		zoo1.addAnimal(new Animal("Red" , "Snake" , 45, 11.0));
		
		Animal[] array = zoo1.getAnimals(); 
		
		boolean boolean1 = zoo[0].equals(array[0]);
		boolean boolean2 = zoo[1].equals(array[1]);
		boolean boolean3 = zoo[2].equals(array[2]);
		boolean boolean4 = zoo[3].equals(array[3]);
		
		boolean actual = false;
		
		if(boolean1 && boolean2 && boolean3 && boolean4)
		{
			actual = true;
		}
		
		Assert.assertEquals(true, actual);
	}
	
	public void testGetCapacity() throws AssertException 
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		zoo.addAnimal(new Animal("Red" , "Snake" , 45, 11.0));
		
		int actual = zoo.getCapacity();
		int expected = initialCapacity;
		
		Assert.assertEquals(expected, actual);
	}
	
	public void testToString() throws AssertException 
	{
		String expected = "These animals live in the zoo: \n"
				+ "Panda, a Black and White-colored animal. 867.0 pounds, 6.0 inches\n" 
				+ "Monkey, a Red-colored animal. 57.0 pounds, 3.0 inches\n"
				+ "Bear, a Black-colored animal. 225.0 pounds, 7.0 inches\n"
				+ "Snake, a Red-colored animal. 45.0 pounds, 11.0 inches\n";
		
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		zoo.addAnimal(new Animal("Red" , "Snake" , 45, 11.0));
		
		String actual = zoo.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void testExpandZoo() throws AssertException
	{
		Zoo zoo = new Zoo(initialCapacity);
		zoo.addAnimal(new Animal("Black and White" , "Panda" , 867, 6.0));
		zoo.addAnimal(new Animal("Red" , "Monkey" , 57, 3.0));
		zoo.addAnimal(new Animal("Black" , "Bear" , 225, 7.0));
		zoo.addAnimal(new Animal("Red" , "Snake" , 45, 11.0));
		zoo.addAnimal(new Animal("Purple" , "Snake" , 45, 11.0));
		zoo.addAnimal(new Animal("White" , "Snake" , 45, 11.0));
		
		int expected = initialCapacity * 2;
		int actual = zoo.getCapacity();
		
		Assert.assertEquals(expected, actual);
	}
}