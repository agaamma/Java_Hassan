import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Ewa
 * Program controlling if given Array contains any duplicated elements.
 * (Scrivere un programma che controlli se vi sono due righe all’interno di un
 * array uguali.)
 */
public class ArrayControlloDuplicati {
    public static void main(String[] args) {
        int [] ArrayExample = {2,5,6,7,1,9,7};
        boolean ExistDuplicate = false;

        for (int i= 0; i < ArrayExample.length-1; i++){
            for (int j = i+1; j<ArrayExample.length; j++) {
                if (ArrayExample[i] == ArrayExample[j]) ExistDuplicate = true;
            }//end of inside for
        }//end for

        if (ExistDuplicate == false) System.out.println("Non ci sono duplicati");
            else System.out.println("ci sono duplicati");

    } // end main
} //end class
