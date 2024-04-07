public class City {
    private String cityName;

//1. get & set per variabili
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

//2. construttore vuoto e con variabili
    public City(){}

    public City(String cityName){
        this.cityName = cityName;
    }
//3. Aggiungere i metodi

    public String StampaCity (){
        return this.cityName;
    }

}
