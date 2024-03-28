import java.util.ArrayList;

public class Persona {
    private String nome;
    private int eta;
    private String CF;

    public Persona(java.lang.String nome, int eta, java.lang.String CF) {
        this.nome = nome;
        this.eta = eta;
        this.CF = CF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }
} //end of class

