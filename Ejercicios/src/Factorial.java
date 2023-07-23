
/**
 *
 * @author Dariem Yesca
 */
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int num;
        Scanner in = new Scanner(System.in);

        System.out.println("Digite el número deseado para conocer su factorial iterativo y su factorial recursivo: ");
        num = in.nextInt();

        // Calcula el factorial de forma iterativa e imprime el resultado
        int factorialIterativo = factorialIterativo(num);
        System.out.println("El factorial iterativo es: " + factorialIterativo);

        // Calcula el factorial de forma recursiva e imprime el resultado
        int factorialRecursivo = factorialRecursivo(num);
        System.out.println("El factorial recursivo es: " + factorialRecursivo);
    }

    public static int factorialIterativo(int n) {
        int fact = 1;
        for (int f = 1; f <= n; f++) {
            fact *= f; 
        }
        return fact;
    }

    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
}
