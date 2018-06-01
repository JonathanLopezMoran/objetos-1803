
package Constructores2;

import javax.swing.JFrame;

public class ProbarConstructores {
    public static void main(String[] args) {
        //Vamos a crear un objeto
        Persona p1=new Persona("Jonathan");
        Persona p2=new Persona();
        JFrame ventanita = new JFrame("Hola mundo");
        ventanita.setSize(300,300);
        ventanita.setVisible(true);
    }
    
}
