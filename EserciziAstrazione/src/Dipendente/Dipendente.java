package Dipendente;

public abstract class Dipendente {
    private String nome;
    private String cognome;
    private Double stipendio;

public Dipendente(){};
public Dipendente (String nome, String cognome){
    this.nome=nome;
    this.cognome=cognome;
}

    public Double getStipendio() {
        return stipendio;
    }

    public void setStipendio(Double stipendio) {
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public abstract Double CalcolaStipendio();
}
