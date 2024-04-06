package exceptions;

public class ColorNotFoundException extends Exception
{
    public static final String EXC_MESSAGE = "Color not found!";

    public ColorNotFoundException()
    {
        super(EXC_MESSAGE);
    }

    public ColorNotFoundException(String message) {
        super(message);
    }
}
