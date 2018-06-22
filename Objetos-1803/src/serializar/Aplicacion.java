
package serializar;

public class Aplicacion {
    public static void main(String[] args)throws Exception{
        
    
        for(Cliente c:PersistenciaUsuario.leer()){
        System.out.println("Nombre "+ c.getNombre());
        }
        
        /*Cliente c=new Cliente();
        c.setNombre("Adrian");
        c.setEdad(20);
        PersistenciaUsuario.guardar(c);
*/
        
    }
    
}
