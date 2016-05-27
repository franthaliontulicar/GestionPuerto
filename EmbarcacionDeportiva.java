
/**
 * Write a description of class EmbarcacionDeportiva here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmbarcacionDeportiva extends Barco
{
    // instance variables - replace the example below with your own
    private int potencia;

    /**
     * Constructor for objects of class EmbarcacionDeportiva
     */
    public EmbarcacionDeportiva(int poten, String matri, float eslo, int ano)
    {
        // initialise instance variables
        super(matri, eslo, ano);
        potencia = poten;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getCoeficienteBernua()
    {
        // put your code here
        return potencia;
    }
    
    public String toString(){
        return "Potencia: "+potencia+"/n Coeficiente de Bernua: "+getCoeficienteBernua();
    }
}
