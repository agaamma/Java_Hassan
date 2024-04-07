import java.util.ArrayList;

public class Region {
    private String nomeRegione;
    ArrayList<City> CityDiRegion = new ArrayList<City>();

    public String getNomeRegione() {
        return nomeRegione;
    }

    public void setNomeRegione(String nomeRegione) {
        this.nomeRegione = nomeRegione;
    }

    public Region(String nomeRegione) {
        this.nomeRegione = nomeRegione;
    }

    public void addCity (City citta){
        boolean esisteGia = false;
        for (City cittaControllata : CityDiRegion) {
            if (cittaControllata.getCityName() == citta.getCityName()) {
                esisteGia = true;
            }//end if

        } if (esisteGia) System.out.println("citta gia esiste!");
        else CityDiRegion.add(citta);
    }//end of add city

    public String stampaRegion (){
        String out = this.nomeRegione + " ha queste citta: " + " \n";
        for (City citta : CityDiRegion){
            out += citta.StampaCity() + "\n";
        }
        return out;
    }

} //end of class
