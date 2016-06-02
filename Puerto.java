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
    private  ArrayList<Alquiler> alquileres;
    private final static int NUMERO_AMARRES = 4;

    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        // initialise instance variables
        alquileres = new ArrayList<Alquiler>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int addAlquiler(int numeroDias, Cliente cliente, Barco barco)
    {   
        int posicionEnLaQueQuedaElBarco = -1;
        int contador = 0;
        while(contador < alquileres.size() && posicionEnLaQueQuedaElBarco==-1) {
            if(alquileres.size() < NUMERO_AMARRES){
                posicionEnLaQueQuedaElBarco = contador;
                Alquiler alquiler = new Alquiler(numeroDias,cliente,barco);
                alquileres.add(alquiler);
            }
            contador++;
        }
        return posicionEnLaQueQuedaElBarco;
    }

    public int buscaPosicionLibre(){
        int posicionLibre = 0;
        int index = 0;
        int posicion = 0;
        boolean encontrada = false;
        boolean encontrado = false;
        if(alquileres.size() != 0){
            while(index <= NUMERO_AMARRES && !encontrado){
                while(posicion <= alquileres.size() && !encontrada){
                    if(index == alquileres.get(posicion).getPosicion()){
                        encontrado = true;
                    }
                    else{
                        posicion++;
                    }                   
                    
                }
                if(!encontrado){
                    posicionLibre = index;
                }
                index++;
                
            }
        }
        return posicionLibre;
    }

    /**
     * Show state of port
     */
    public void verEstadoAmarres()
    {
        boolean alquilado = false;
        for(Alquiler alquiler: alquileres) {
            if(alquiler != null) {
                System.out.println(alquiler);
                alquilado = true;
            }             
        }

        if(!alquilado){
            System.out.println("No se realiza alquiler");
        }
    }

    /**
     * Liberate moorage. Returns -1 if posicion is not valid
     */
    public float liquidarAlquiler(int posicion)
    {
        float valor = -1;
        if(posicion < NUMERO_AMARRES && posicion >= 0){
            if(alquileres != null){
                valor = alquileres.get(posicion).getCosteAlquiler();
                alquileres.remove(posicion);
            }
        }
        return valor;
    }

}
