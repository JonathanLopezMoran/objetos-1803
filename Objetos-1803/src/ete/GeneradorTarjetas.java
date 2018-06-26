
package ete;
import java.util.*;
public class GeneradorTarjetas {
  
    private ArrayList <Cliente> cliente;

    public ArrayList <Cliente> getCliente() {
        return cliente;
    }

    public void setCliente(ArrayList <Cliente> cliente) {
        this.cliente = cliente;
    }
    
    public GeneradorTarjetas(){
        cliente = new ArrayList<>();
        
        cliente.add(new Cliente(" Juan", new Tarjeta(" Banamex", 1234, 32000)));
        cliente.add(new Cliente (" Ana", new Tarjeta(" HSBC", 5678, 17500)));
        cliente.add(new Cliente (" Pedro", new Tarjeta(" Sestra", 8765, 19600)));
        cliente.add(new Cliente (" Irma", new Tarjeta(" Bancomer", 4321, 48000)));
    }
    
}
