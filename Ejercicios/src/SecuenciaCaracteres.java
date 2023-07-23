
/**
 *
 * @author Dariem Yesca
 */
import java.util.Scanner;

public class SecuenciaCaracteres {

    //Método Recursivo        
    public static String SecuenciaInvertida(String secuencia) {
        if (secuencia.isEmpty()) {
            return secuencia;
        } else {
            char primerCaracter = secuencia.charAt(0);
            String restoSecuencia = secuencia.substring(1);

            String secuenciaInvertidaResto = SecuenciaInvertida(restoSecuencia);

            return secuenciaInvertidaResto + primerCaracter;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la secuencia de caracteres: ");
        String secuencia = scanner.nextLine();

        String secuenciaInvertida = SecuenciaInvertida(secuencia);
        System.out.println("Secuencia original: " + secuencia);
        System.out.println("Secuencia invertida: " + secuenciaInvertida);

        scanner.close();
    }
}
