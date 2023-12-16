public class BusInfo {
    public String numberBus;
    public String numberTrip;
    public String busBrand;


    public BusInfo(String pNumberTrip, String pBusBrand, String pNumberBus) {
        numberTrip = pNumberTrip;
        busBrand = pBusBrand;
        numberBus = pNumberBus;
    }

    public String getNumberBus() {
        return numberBus;
    }

    public String getNumberTrip() {
        return numberTrip;
    }

    public String getBusBrand() {
        return busBrand;
    }

}
