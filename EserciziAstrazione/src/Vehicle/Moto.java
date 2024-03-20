package Vehicle;

public class Moto extends Vehicle{
    private int capienzaSerbatoio;
    private int serbatoio;

    public Moto(int capienzaSerbatoio){
        this.capienzaSerbatoio=capienzaSerbatoio;
        this.serbatoio=0;
    }
    public int getCapienzaSerbatoio() {
        return capienzaSerbatoio;
    }

    public void setCapienzaSerbatoio(int capienzaSerbatoio) {
        this.capienzaSerbatoio = capienzaSerbatoio;
    }

    public int getSerbatoio() {
        return serbatoio;
    }

    public int faiBenzina(int litri){
        if(serbatoio+litri<=capienzaSerbatoio){
        return serbatoio = serbatoio + litri;}
        else{
            return serbatoio = (serbatoio + litri) - capienzaSerbatoio;
        }
    }

    @Override
    public Boolean startEngine() {
        if (serbatoio>0) {setMotoreAcceso(true);}
        else {setMotoreAcceso(false);}
        return getMotoreAcceso();
    }

    @Override
    public Boolean stopEngine() {
        setMotoreAcceso(false);
        return getMotoreAcceso();
    }
}
