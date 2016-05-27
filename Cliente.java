
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String dni;
    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nom, String d)
    {
        // initialise instance variables
        nombre = nom;
        dni = d;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        // put your code here
        return nombre;
    }
    
    public String getDni()
    {
        // put your code here
        return dni;
    }
    
    public String toString()
    {
        // put your code here
        return "nombre: " +nombre+" DNI " +dni;
    }
}
