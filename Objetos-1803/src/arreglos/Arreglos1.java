package arreglos;

public class Arreglos1 {

    public static void main(String[] args) {
        int[] valores = {1, -20, 4};
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        //Este ciclo for es el mejorado y se recomienda siempre
        for (int v : valores) {
            System.out.println(v);
        }

        //Segunda forma de inicializar los arreglos
        int otro[] = new int[4];
        for (int valor : otro) {
            System.out.println(valor);
        }
    }
}
