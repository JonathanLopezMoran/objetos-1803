
package serializar;

import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
    
    //Primero guardamos
    public static void guardar(Cliente c)throws Exception{
        //Paso 1: Generar el archivo donde se va a guardar nuestro seralizado
        ArrayList<Cliente> clientes=new ArrayList<>();
        File file = new File("archivaldo.yomero");
        if(file.exists()) clientes=leer();
        clientes.add(c);
        
        //Paso 2: Indicar que lo vamos a generar para escribir en él
        FileOutputStream fos = new FileOutputStream(file);
        
        //Paso 3: Escribir un objeto en él
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(clientes);
        oos.close();
        
    }
    
    public static ArrayList<Cliente> leer()throws Exception{
        //Para leer primero ponemos el archivo
        File file=new File("archivaldo.yomero");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        ArrayList<Cliente> clientes = (ArrayList<Cliente>) ois.readObject();
        return clientes;
    }
    
}
