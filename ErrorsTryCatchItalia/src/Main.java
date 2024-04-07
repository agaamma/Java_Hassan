

public class Main {
    public static void main(String[] args) {


        Region Piemonte = new Region("Piemonte");
        City Torino = new City("Torino");

        Piemonte.addCity(new City("Alba"));
        Piemonte.addCity(new City("Salbentrand"));
        Piemonte.addCity(Torino);




        System.out.println(Piemonte.stampaRegion());


    } // end of main
} // end of class