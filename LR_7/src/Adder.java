public class Adder {
    private RouteStorage busTrip;

    public Adder(RouteStorage pBusTrip) {
        this.busTrip = pBusTrip;
    }

    public void addByRoute(String tripNumber, String busNumber, String busBrand, String nameRoute, String date, String time) {
        BusInfo bi = new BusInfo(tripNumber, busNumber, busBrand);
        RouteInfo ri = new RouteInfo(nameRoute, date, time);
        busTrip.getData().put(bi, ri);
        System.out.println("Марщрут добавлен!");
    }
}
