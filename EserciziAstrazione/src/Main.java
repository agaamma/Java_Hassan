import Dipendente.Teacher;
import Animali.Leone;
import Animali.Tigre;
import Vehicle.Auto;
import Vehicle.Moto;

public class Main {
    public static void main(String[] args) {

Teacher insegnanteMatematica = new Teacher();
insegnanteMatematica.setStipendio(1200.0);
insegnanteMatematica.setBonus(700.0);
        System.out.println(insegnanteMatematica.getBonus());
        System.out.println(insegnanteMatematica.getStipendio());
        System.out.println(insegnanteMatematica.CalcolaStipendio());

        Leone Leo = new Leone();
        System.out.println(Leo.sound());

        Tigre Taiger = new Tigre();
        System.out.println(Taiger.sound());

        Auto Clio = new Auto();
        System.out.println("Start engine prima di fai benzina " + Clio.startEngine());
        Clio.faiBenzina(20);
        System.out.println("Start engine dopo fai benzina " + Clio.startEngine());
        System.out.println(Clio.stopEngine());

        Moto Vespa = new Moto (5);
        System.out.println("Strat engine prima di fai benziana " + Vespa.startEngine());
        System.out.println("litri rimasti dopo fai benzina " + Vespa.faiBenzina(20));
        System.out.println("Start engine dopo fai benzina " + Vespa.startEngine());

    }//end of Main

}//end of class