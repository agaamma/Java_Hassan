package esercizio2;

import java.util.Scanner;

public class CalcolatriceTrigonometricaConIF {

    public static void main(String[] args) {
        System.out.println("Scegli fra le operazioni:\n" +
                "\t 1) Somma\n \t 2) Differenza\n \t 3) Divisione\n \t 4) Moltiplicazione");

        Scanner inputKeyboard = new Scanner(System.in);

        System.out.println("Inserisci l'operazione");
        int operatore =Integer.parseInt(inputKeyboard.nextLine());

        if(operatore == 1)
        {
            System.out.println("Inserici il primo addento");
            double primoAddendo = Double.parseDouble(inputKeyboard.nextLine());
            System.out.println("Inserici il secondo addento");
            double secondoAddendo = Double.parseDouble(inputKeyboard.nextLine());
            System.out.println("il risultato della somma: " + (primoAddendo + secondoAddendo));

                //importante mettere parentesi dove fai somma, cosi esegue prima cose e in parentesi
            //else if (operatore == 2) {};
        }//end if
        }//end main
    }// end class