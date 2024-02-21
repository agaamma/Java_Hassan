import java.util.Scanner;
/**
 * @author Ewa
 * Implementation of code that will take as input numer and give back information whether the number is divisible by 2, 3, 4, 5.
 * (Implementare un pezzo di codice che permetta di controllare se un numero è
 * divisibile per 2, 3, 4, 5.)
 */
public class DivisionePerNr2da5 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        int numeroInserito;
        int numeroDivisore;

        System.out.println("Inserisci il numero");
        numeroInserito = tastiera.nextInt();

        for (numeroDivisore = 2; numeroDivisore<=5; numeroDivisore++){
            if (numeroInserito % numeroDivisore == 0)
                {System.out.println(numeroInserito + " e divisible per "+ numeroDivisore);}
            else System.out.println(numeroInserito + " non e divisible per " + numeroDivisore);
        }//end for


    } //end main
}//end class
