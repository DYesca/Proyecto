
/**
 *
 * @author Dariem Yesca
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class PotenciaRecursiva {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el número base: ");
        int base = obtenerNumero(lector);
        System.out.println("Introduzca el número exponente: ");
        int exponente = obtenerNumero(lector);

        double resultado = calcularPotenciaRecursiva(base, exponente);
        System.out.printf("%n%d elevado a %d es igual a %.3f", base, exponente, resultado);
    }

    private static int obtenerNumero(Scanner lector) {
        while (true) {
            try {
                int numero = lector.nextInt();
                return numero;
            } catch (InputMismatchException e) {
                lector.next(); // Limpiar el buffer de entrada
                System.out.println("Error: Debes ingresar un número entero. Intenta nuevamente.");
            }
        }
    }

    private static double calcularPotenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente < 0) {
            return calcularPotenciaRecursiva(base, exponente + 1) / base;
        } else {
            return base * calcularPotenciaRecursiva(base, exponente - 1);
        }
    }
}
