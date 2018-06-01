
package imc;

public class Aplicacion {
    public static void main(String[] args) {
        //Crear un objeto de tipo Grados
        Usuario g=new Usuario();
        //A este objeto le asignamos un valor a su atributo centígrados
        g.setPeso(20);
        
        //Creamos un objeto de la clase conversión
        Imc c=new Imc();
        c.setUsuario();
        //Aplicar el modelo
        
        
        System.out.println(c.PesoPorAltura());
                
    }
}