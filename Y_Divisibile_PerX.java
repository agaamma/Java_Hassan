import java.util.Scanner;
/**
 * @author Ewa
 * Implementation of code that will take as input numer X and Y and give back information whether the number X is divisible by Y.
 * (implementare una funzione che permetta di vedere se un qualsiasi numero X sia divisibile per un qualsiasi numero y)
 */

public class Y_Divisibile_PerX {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int numeroInseritoX;
        int numeroDivisoreY;

        System.out.println("Inserisci il numero da dividere");
        numeroInseritoX = tastiera.nextInt();

        System.out.println("Inserisci il numero divisore");
        numeroDivisoreY = tastiera.nextInt();

        if (numeroInseritoX % numeroDivisoreY == 0) {
            System.out.println(numeroInseritoX + " e divisible per " + numeroDivisoreY);
        } else System.out.println(numeroInseritoX + " non e divisible per " + numeroDivisoreY);

    } //end main
} //end class

