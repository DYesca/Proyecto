package Clases;

/**
 *
 * @author Dariem Yesca
 */
public class ClaseHija_Retiro extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.print("¿Cuánto deseas retirar?: ");
        Retiro();
        if (retiro <= getSaldo()) {
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("---------------------------------");
            System.out.println("Retiraste: " + retiro);
            System.out.println("Tu saldo actual es: " + getSaldo());
            System.out.println("---------------------------------");
        } else {
            System.out.println("-------------------------");
            System.out.println("El saldo es insuficiente.");
            System.out.println("-------------------------");
        }

    }

}
