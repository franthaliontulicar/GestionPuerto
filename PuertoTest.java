

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test002()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(4, "aaa", 12, 1980);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(1400, "bbb", 25, 2005);
        Yate yate1 = new Yate(12, 2000, "ccc", 23, 2000);
        Velero velero2 = new Velero(5, "ddd", 10, 2010);
        Cliente cliente1 = new Cliente("raul", "321019j");
        Cliente cliente2 = new Cliente("Juanfran", "32658f");
        Cliente cliente3 = new Cliente("cristiano", "12345l");
        Cliente cliente4 = new Cliente("enrique iglesias", "000125s");
        assertEquals(0, puerto1.addAlquiler(4, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, velero2));
        assertEquals(2, puerto1.addAlquiler(3, cliente4, yate1));
        assertEquals(1700, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(5, cliente3, embarcac1));
        assertEquals(3, puerto1.addAlquiler(7, cliente2, yate1));
    }
}

