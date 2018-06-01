
package abstraccion;

public class Conversion {
    private Grados grados;
    
    private Longitud longitud;
    
    public float centigradosAFarenheit(){
        //Este método tiene lógica
        
        float resultado= grados.getCentigrados()*1.8f+32;
        return resultado;
    }
    
     public float metrosAPies(){
        //Este método tiene lógica
        
        float resultado= longitud.getMetros()*3.28f;
        return resultado;
     }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
    }
    
    public Longitud getLongitudes() {
        return longitud;
    }

    public void setLongitudes(Longitud longitud) {
        this.longitud = longitud;
    }

    void setLongitud(Longitud g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

