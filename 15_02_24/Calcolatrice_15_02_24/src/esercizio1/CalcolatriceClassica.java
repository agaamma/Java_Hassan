package esercizio1;
import java.util.Scanner;

/**
 * @author Ewa
 * Classe che implementa il primo esercizo che si occupa di creare una calcolatrice clasice,
 * ovvero, una calcolatrice che implementa le 4 operazioni fondamentali
 */
public class CalcolatriceClassica
{
    public static void main(String[] args)
    {
        //-----------SOMMA----------------------------------------------------
        int primoNumero = 6;
        int secondoNumero = 4;
        int somma = primoNumero + secondoNumero;
        System.out.println("il risultato della somma:" + somma);

        //-----------SOTRAZIONE-----------------------------------------------
        Scanner inputKeyboard = new Scanner(System.in);
        System.out.println("Inserici il primo numero da sottrare");
        int numeroSottrazione1= Integer.parseInt(inputKeyboard.nextLine());
        System.out.println("Inserici il secondo numero da sottrare");
        int numeroSottrazione2= Integer.parseInt(inputKeyboard.nextLine());
        System.out.println("Il risultato di sottrazione: " + (numeroSottrazione1 - numeroSottrazione2));

        //----------MOLTIPLICAZIONE-------------------------------------------

        System.out.println("Inserici il numero da moltiplicare");
        int numeroMolitplicazione1= Integer.parseInt(inputKeyboard.nextLine());
        System.out.println("Inserici il numero da moltiplicare");
        int numeroMolitplicazione2= Integer.parseInt(inputKeyboard.nextLine());
        System.out.println("Il risultato di moltiplicazione: " + numeroMolitplicazione1*numeroMolitplicazione2);


        //-----------DIVISIONE----------------------------------------------------
        System.out.println("Inserici il numero da dividere");
        int numeroDaDividere= Integer.parseInt(inputKeyboard.nextLine());
        System.out.println("Inserici il divisore");
        int divisore = Integer.parseInt(inputKeyboard.nextLine());

        if (divisore == 0)
            System.out.println("non puoi dividere per 0");
        else
            System.out.println("Il risultato di divisione e: " + numeroDaDividere/divisore);

    } //end main
}//end class
