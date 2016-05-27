
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    // instance variables - replace the example below with your own
    private int numeroDias;
    private Cliente cliente;
    private Barco barco;
    private final static int VALOR_FIJO_ALQUILER = 300;
    private final static int MULTIPLICADOR_ESLORA = 10;

    /**
     * Constructor for objects of class Alquiler
     */
    public Alquiler(int dias, Cliente clien, Barco bar)
    {
        // initialise instance variables
        numeroDias = dias;
        cliente = clien;
        barco = bar;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
    public float getCosteAlquiler()
    {
        // put your code here
        return numeroDias*(barco.getEslora()*10)+300*barco.getCoeficienteBernua();
    }
    public String toString(){
        return "Numero de Dias: "+numeroDias+"/n Precio de Alquiler: "+getCosteAlquiler();
    }
}
