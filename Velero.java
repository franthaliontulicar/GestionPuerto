
/**
 * Write a description of class Velero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Velero extends Barco
{
    // instance variables - replace the example below with your own
    private int numeroMastiles;

    /**
     * Constructor for objects of class Velero
     */
    public Velero(int numMas, String matri, float eslo, int ano)
    {
        // initialise instance variables
        super(matri, eslo, ano);
        numeroMastiles = numMas;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   
    public int getCoeficienteBernua(){
        return numeroMastiles;
    }
    
    public String toString(){
        return "Numero de Mastiles: "+numeroMastiles+"/n Coeficiente de Bernua: "+getCoeficienteBernua();
    }
}
