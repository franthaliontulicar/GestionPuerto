import java.util.ArrayList;
/**
 * Write a description of class Puerto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Puerto
{
    // instance variables - replace the example below with your own
    private  Alquiler[] alquileres;
    private final static int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        // initialise instance variables
         alquileres = new Alquiler[NUMERO_AMARRES];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int addAlquiler(int numeroDias, Cliente clien, Barco bar)
    {
        // put your code here
         boolean creado = false;
        int posicion = -1;
        int i = 0;
        while(posicion < NUMERO_AMARRES && !creado){
            if(alquileres[i] == null){
                alquileres[i] = new Alquiler(numeroDias, clien, bar);
                posicion = i;
                creado = true;
            }
            i++;
        }
        return posicion;
    }
    public void verEstadoAmarre(){
        for(int i = 0; i < NUMERO_AMARRES; i++){
            if(alquileres[i] == null){
                System.out.println(alquileres[i]);
            }
        }
    }
    public float liquidarAlquiler(int posicion){
        Alquiler alquiler = alquileres[posicion];
        alquileres[posicion] = null;
        return alquiler.getCosteAlquiler();
    }
}
