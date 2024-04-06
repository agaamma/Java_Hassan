package exceptions;

public class PersonaNotFoundException extends Exception
{
    public static final String EXC_MESSAGE = "Persona not found";

    public PersonaNotFoundException() {
        super(EXC_MESSAGE);
    }

    public PersonaNotFoundException(String message) {
        super(message);
    }
}
