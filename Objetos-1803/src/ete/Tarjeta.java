
package ete;

public class Tarjeta {
    
    private String nombre;
    private int numero;
    private float saldo;

    public Tarjeta(String nombre, int numero, float saldo) {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Tarjeta() {
    }

    public Tarjeta(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }

}


