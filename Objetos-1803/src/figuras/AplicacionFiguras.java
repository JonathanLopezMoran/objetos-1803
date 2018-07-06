
package figuras;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AplicacionFiguras {
    
    public static void main(String[] args) {
        try {
            //Primero creamos un objeto de tipo cuadrado
            Cuadrado c=new Cuadrado();
            
            //Ajustamos el valor de lado
            ValidarValores.validarNoNegativo(-4);
            c.setLado(4);
            
            //Generamos un objeto de tipo calculos
            Calculos cal=new Calculos();
            System.out.println(cal.calcularArea(c)); 
            
        } catch (ValorNegativoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
