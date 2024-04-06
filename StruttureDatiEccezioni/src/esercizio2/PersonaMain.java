package esercizio2;

import java.util.ArrayList;
import java.util.List;
import exceptions.PersonaNotFoundException;

public class PersonaMain
{
    public static boolean checkPersonaExists(List<Persona> personaList, String CF)
    {
        Persona persona = null;
        try
        {
           /* for (Persona persona1 : personaList) {
                if(persona1.getCF().equals(CF))
                    return true;
            }*/
            persona = personaList
                    .stream()
                    .filter(p -> CF.equals(p.getCF()))
                    .findFirst()
                    .orElse(null);
            if(persona == null)
                throw new PersonaNotFoundException();
            return true;
        }catch (PersonaNotFoundException ex)
        {
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void main(String[] args)
    {
        List<Persona> personaList = new ArrayList<>(List.of(
                new Persona("CPPAAA", "Ciccio", "Graziani"),
                new Persona("CPPBBB", "Ciccio", "Pasticcio"),
                new Persona("CPPCCC", "Sossio", "Aruta")
                ));
        System.out.println(checkPersonaExists(personaList, "CPPAAA"));
        System.out.println(checkPersonaExists(personaList, "LALALA"));

    }
}
