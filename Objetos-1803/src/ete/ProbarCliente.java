
package ete;

public class ProbarCliente {
    public static void main(String[] args) {
        for (Cliente c:new GeneradorTarjetas().getCliente()){
            System.out.println(c);
        }
    }
    
    
}
