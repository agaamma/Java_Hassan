import java.io.*;
public class ErrorePersona extends RuntimeException {
    public ErrorePersona(String messaggio){
        super(messaggio);
    }
}
