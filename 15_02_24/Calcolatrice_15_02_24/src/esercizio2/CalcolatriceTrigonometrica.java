package esercizio2;
import java.sql.SQLOutput;
import java.util.Scanner;
/**
 * @author Ewa
 * Calcolatrice dove puoi scegliere un operazione
 *
 */
public class CalcolatriceTrigonometrica {
    public static void main(String[] args) {
        System.out.println("Scegli fra le operazioni:\n" +
                "\t 1) Somma\n \t 2) Differenza\n \t 3) Divisione\n \t 4) Moltiplicazione");

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Inserisci l'operazione");
        int operatore =Integer.parseInt(inputKeyboard.nextLine());

                switch (operatore)
                {
                    case 1:
                        System.out.println("Inserici il primo addento");
                        double primoAddendo = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("Inserici il secondo addento");
                        double secondoAddendo = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("il risultato della somma: " + (primoAddendo + secondoAddendo));
                        //importante mettere parentesi dove fai somma, cosi esegue prima cose e in parentesi
                        break;
                    case 2:
                        System.out.println("sono la diferenza");
                        System.out.println("Inserisci il primo numero per differenza");
                        double primaDiferenza = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("Inserisci il secondo numero per differenza");
                        double secondaDiferenza = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("La differenza e: " + (primaDiferenza - secondaDiferenza));
                        break;
                    case 3:
                        System.out.println("sono divisione");
                        System.out.println("Inserisci il numero per dividere");
                        double primoDivisione = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("Inserisci il divisore");
                        double divisore = Double.parseDouble(inputKeyboard.nextLine());
                        //if in linea sotto come alternativa piu breve, dove "?" e if, e ":" sta per else
                        double risultato = divisore == 0 ? Double.POSITIVE_INFINITY : (primoDivisione/divisore);
                        if (divisore == 0) System.out.println("non puoi dividere per 0");
                        else System.out.println("il risultato e " + (primoDivisione/divisore));
                    case 4:
                        System.out.println("sono multiplicazione");
                        System.out.println("Inserisci il numero per moltiplicare");
                        double primoMultiplicazione = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("Inserisci il multiplicatore");
                        double multiplicatore = Double.parseDouble(inputKeyboard.nextLine());
                        System.out.println("il risultato di multiplcazione e: " + (primoMultiplicazione*multiplicatore));

                    //il default case valuta e esegue le instruzioni dei casi non presenti

                    default:
                        System.out.println("Secgli fra le quelle presenti");
                }//end switch
    }//end main
}// end class
