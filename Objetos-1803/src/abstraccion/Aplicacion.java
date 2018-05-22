
package abstraccion;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear un objeto de tipo Grados
        Grados g=new Grados();
        //A este objeto le asignamos un valor a su atributo centígrados
        g.setCentigrados(20);
        
        //Creamos un objeto de la clase conversión
        Conversion c=new Conversion();
        c.setGrados(g);
        //Aplicar el modelo
        
        
        System.out.println(c.centigradosAFarenheit());
                
    }
    
}
