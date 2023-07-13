package Clases;

/**
 *
 * @author Dariem Yesca
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta {

    @Override
    public void Transacciones() {
        System.out.print("¿Cuánto deseas depositar?: ");
        Deposito();

        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println("Ha depositado correctamente: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo());
        System.out.println("---------------------------------");
    }

}
