
/**
 * Write a description of class Yate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yate extends EmbarcacionDeportiva
{
    // instance variables - replace the example below with your own
    private int camarotes;

    /**
     * Constructor for objects of class Yate
     */
    public Yate(int cama, int poten, String matri, float eslo, int ano)
    {
        // initialise instance variables
        super(poten,matri, eslo, ano);
        camarotes = cama;
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
        return super.getCoeficienteBernua() + camarotes;
    }
    
    public String toString(){
        return "Camarotes: "+camarotes+"/n Coeficiente de Bernua: "+getCoeficienteBernua();
    }
}
