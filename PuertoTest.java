

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
    @Test
     public void testCompi()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("Victor", "74352739B");
        Cliente cliente2 = new Cliente("Theyvith", "54374983R");
        Cliente cliente3 = new Cliente("Paquito", "543344583V");
        Cliente cliente4 = new Cliente("Pepe", "46295035W");
        Cliente cliente5 = new Cliente("Don Quijote", "64529304Y");
        Velero velero1 = new Velero(3, "564OOO", 6, 2010);
        Yate yate1 = new Yate(3, 1500, "345TTT", 25, 2015);
        Velero velero2 = new Velero(3, "543CCC", 10, 1995);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(2500, "333ZZZ", 34, 2000);
        Yate yate2 = new Yate(8, 2000, "111MMM", 40, 1999);
        assertEquals(0, puerto1.addAlquiler(3, cliente1, velero1));
        assertEquals(-1, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(7, cliente2, yate1));
        assertEquals(1080, puerto1.liquidarAlquiler(0), 0.1);
        assertEquals(0, puerto1.addAlquiler(2, cliente3, velero2));
        assertEquals(2, puerto1.addAlquiler(5, cliente4, embarcac1));
        assertEquals(452650, puerto1.liquidarAlquiler(1), 0.1);
    }
    @Test
    public void testPuerto01()
    {
        Velero velero1 = new Velero(4, "ABC", 20, 1989);
        Yate yate1 = new Yate(10, 20000, "GGG", 40, 1999);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(3000, "JKJ", 22, 2001);
        Cliente cliente1 = new Cliente("Juan Magan", "33444555K");
        Cliente cliente2 = new Cliente("Paulina Rubio", "27666777O");
        Cliente cliente3 = new Cliente("Enrique Iglesias", "90888777G");
        Puerto puerto1 = new Puerto();
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(2, cliente2, yate1));
        assertEquals(2, puerto1.addAlquiler(3, cliente3, embarcac1));
        Velero velero2 = new Velero(1, "BBB", 15, 2010);
        Cliente cliente4 = new Cliente("Julio Iglesias", "23444555K");
        assertEquals(3, puerto1.addAlquiler(10, cliente4, velero2));
        Cliente cliente5 = new Cliente("Pedro Duque", "89777444K");
        Yate yate2 = new Yate(8, 40000, "YYY", 45, 2012);
        assertEquals(-1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
        assertEquals(800 + (300 * 20010), puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(1, puerto1.addAlquiler(1, cliente5, yate2));
        puerto1.verEstadoAmarres();
    }
}

