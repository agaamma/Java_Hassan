package Vehicle;

public abstract class Vehicle {
    private Boolean motoreAcceso;

    public void setMotoreAcceso(Boolean motoreAcceso) {
        this.motoreAcceso = motoreAcceso;
    }

    public Vehicle(){};
    public abstract Boolean startEngine();
    public abstract Boolean stopEngine();

    public Boolean getMotoreAcceso() {
        return motoreAcceso;
    }
}
