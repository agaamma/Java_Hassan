package Dipendente;

public class Teacher extends Dipendente {
    private Double bonus;

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        if (bonus<=this.getStipendio()/2)
        {this.bonus = bonus;}
        else{this.bonus=this.getStipendio()/2;}
    }

    @Override
    public Double CalcolaStipendio() {
        return (this.getStipendio()+this.bonus);
    }
}
