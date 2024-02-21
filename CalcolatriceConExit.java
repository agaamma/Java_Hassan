import java.util.Scanner;
/**
 * @author Ewa
 * Implementation of classic calculator. Available operations are:
 *  1. Sum
 *  2. Subtraction
 *  3. Multiplication
 *  4. Division
 *  Y Exit
 * The user will have to select operaion from 1 to 4 for calculations or Y to exit from the program.
  */
public class CalcolatriceConExit
{

    public static void main(String[] args)
    {
        double primoNumero=0;
        double secondoNumero=0;
        double risultato;
        Scanner tastiera = new Scanner(System.in); // user input from keyboard

        System.out.println("SCEGLI UNA DELLE OPERAZIONI DA IMPLEMENTARE TRA QUELLE DI SEGUITO");
        System.out.println("1) Addizione\t 2) Sottrazione\t 3) Moltiplicazione\t 4) Divisione\t Y) Exit");

        String sceltaOperazione = tastiera.nextLine();

        String seltaY="y";
        if  (! sceltaOperazione.equalsIgnoreCase(seltaY)){
            System.out.println("Inserisci il primo numero");
            primoNumero = tastiera.nextDouble();

            System.out.println("Inserisci il secondo numero");
            secondoNumero = tastiera.nextDouble();
        }

        switch(sceltaOperazione)
        {
            case "1":
                risultato = primoNumero + secondoNumero;
                System.out.println("Il risultato della somma è: " + risultato);
                break;
            case "2":
                risultato = primoNumero - secondoNumero;
                System.out.println("Il risultato della differenza è: " + risultato);
                break;
            case "3":
                risultato = primoNumero * secondoNumero;
                System.out.println("Il risultato della moltiplicazione è: " + risultato);
                break;
            case "4":
                if(secondoNumero != 0)
                {
                    risultato = primoNumero / secondoNumero;
                    System.out.println("Il risultato della divisione è: " + risultato);
                }
                else
                    System.out.println("Non puoi dividere per 0!");
                break;
            case "Y","y":

                break;
            default:
                System.out.println("Nessuna delle operazioni scelte è disponibile!");
        } //end switch

    } //end main
} //end class