/**
 * Abstract class Barco - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Barco
{
    // instance variables - replace the example below with your own
    private String matricula;
    private float eslora;
    private int anoFabricacion;
    
    public Barco(String mat, float eslo, int ano){
        matricula = mat;
        eslora = eslo;
        anoFabricacion = ano;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String getMatricula()
    {
        // put your code here
        return matricula;
    }
    
    public float getEslora(){
        return eslora;
    }
    
    public int getAnoFabricacion(){
        return anoFabricacion;
    }
    
    public abstract int getCoeficienteBernua();
            
    
    
    public String toString(){
        return "Matricula: "+matricula+"/n Eslora: "+eslora+"/n Año de Fabricacion: "+anoFabricacion;
    }
    
}
