
package serializar;

import java.io.*;
public class PersistenciaUsuario {
    
    //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //Paso 1: Generar el archivo donde se va a guardar nuestro seralizado
        File file = new File("D:\\archivaldo.yomero");
        
        //Paso 2: Indicar que lo vamos a generar para escribir en él
        FileOutputStream fos = new FileOutputStream(file);
        
        //Paso 3: Escribir un objeto en él
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
        
    }
    
}
