package excepciones;

public class SegundasExcepciones {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int arreglo[] = {1, 2};
        try {
            String numeroMalo = "4";
            int numeroBueno = Integer.parseInt(numeroMalo);

            System.out.println(a / b);
            System.out.println(numeroBueno * 2);
            System.out.println(arreglo[1]);
        } catch (NumberFormatException e) {
            System.out.println("Podrías meter un número válido?");
        } catch (ArithmeticException e) {
            System.out.println("no se aceptan divisiones entre cero");
        } catch (Exception e) {
            System.out.println("Esto índice no existe "+e.getMessage());
        }

    }
}
