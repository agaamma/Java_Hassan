package Vehicle;

public class Auto extends Vehicle{
    private int serbatoio;
    public Auto(){this.serbatoio=0;};


    public int faiBenzina(int litri){
        if ((this.serbatoio+litri)<=30){
            this.serbatoio= this.serbatoio +litri;
            return 0;
        }
        else{
            int rimasti = this.serbatoio+litri-30;
            this.serbatoio=30;
            return rimasti;
        }

    };

    @Override
    public Boolean startEngine() {
        if (this.serbatoio>0){
            setMotoreAcceso(true);}
        else {
            setMotoreAcceso(false);
        }
        return getMotoreAcceso();
    }

    @Override
    public Boolean stopEngine() {
        setMotoreAcceso(false);
        return getMotoreAcceso();
    }
}
