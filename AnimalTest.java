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
}

