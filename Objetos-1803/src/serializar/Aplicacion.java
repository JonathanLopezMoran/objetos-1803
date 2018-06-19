
package serializar;

public class Aplicacion {
    public static void main(String[] args)throws Exception{
        
        //Pues a usar nuestro modelo
        Cliente c = new Cliente();
        c.setEdad(20);
        c.setNombre("Jonathan");
        c.setSueldo(20000);
        
        PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con éxito");
        
    }
    
}
