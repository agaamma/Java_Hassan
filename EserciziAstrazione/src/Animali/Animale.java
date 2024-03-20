package Animali;

public abstract class Animale {
    private String nomeAnimale;
public abstract String sound();

public Animale(){};

    public String getNomeAnimale() {
        return nomeAnimale;
    }

    public void setNomeAnimale(String nomeAnimale) {
        this.nomeAnimale = nomeAnimale;
    }
}
