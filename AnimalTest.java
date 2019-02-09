/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	
	public final String COLOR = "Blue";
	public final String NAME = "Tiger";
	public final double HEIGHT = 7.0;
	public final double WEIGHT = 225.6;
	
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01); // they are compared within 0.01
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    public void testAnimalStringStringDoubleDouble() throws AssertException
	{
		// Uses the full constructor
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		
		// the name should be tiger, color should be blue, weight should be 225.6, height should be 7.0
		Assert.assertEquals("Blue", animal.getColor());
		Assert.assertEquals("Tiger", animal.getName());
		Assert.assertEquals(225.6, animal.getWeight(), 0.01);
		Assert.assertEquals(7.0, animal.getHeight(), 0.01);
	}
    
    public void testGetColor() throws AssertException
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		String expected = "Blue";
		String actual = animal.getColor();
		
		Assert.assertEquals(expected, actual);
	}
    
    public void testGetName() throws AssertException 
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		String expected = "Tiger";
		String actual = animal.getName();
		
		Assert.assertEquals(expected, actual);
	}
    
	public void testGetWeight() throws AssertException 
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		double expected = 225.6;
		double actual = animal.getWeight();
		
		Assert.assertEquals(expected, actual, 0.01);
	}
	
	public void testGetHeight() throws AssertException 
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		double expected = 7.0;
		double actual = animal.getHeight();
		
		Assert.assertEquals(expected, actual, 0.01);
	}
	
	public void testToString() throws AssertException 
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		String expected = "Tiger, a Blue-colored animal. 225.6 pounds, 7.0 inches\n";
		String actual = animal.toString();
		
		Assert.assertEquals(expected, actual);
	}
	
	public void testEqualsObject() throws AssertException 
	{
		Animal animal = new Animal(COLOR, NAME, WEIGHT, HEIGHT);
		Animal animal2 = new Animal("Red", "Monkey", 25.5, 7.0);
		Animal animal3 = new Animal("Red", "Tiger", 225.6, 7.0);
		Animal animal4 = new Animal("Blue", "Tiger", 225.6, 7.0);
		
		Assert.assertEquals(true, animal.equals(animal));
		Assert.assertEquals(false, animal.equals(animal2));
		Assert.assertEquals(false, animal.equals(animal3));
		Assert.assertEquals(true, animal.equals(animal4));
		
	}
}

