
package imc;

public class Imc {
    private Usuario usuario;
    private float Altura;
    private Peso peso;
    
    public float PesoPorAltura(){
        //Este método tiene lógica
        
        float resultado= usuario.getPeso()*Altura;
        return resultado;
    }
    

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    void setUsuario() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private static class Peso {

        public Peso() {
        }
    }
    
    
    
}
    

