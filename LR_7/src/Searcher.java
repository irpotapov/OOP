import java.util.Map;

public class Searcher {
    private RouteStorage busTrip;

    public Searcher(RouteStorage pBusTrip) {
        this.busTrip = pBusTrip;
    }

    public void searchByRoute(String route) {
        boolean res = false;
        for (Map.Entry<BusInfo, RouteInfo> entry : busTrip.getData().entrySet()) {
            if (entry.getValue().getRoute().equals(route)) {
                BusInfo bus = entry.getKey();
                System.out.println("Номер рейса: " + bus.getNumberTrip());
                System.out.println("Дата: " + entry.getValue().getDay());
                System.out.println("Время: " + entry.getValue().getTime());
                System.out.println("Номер автобуса: " + bus.getNumberBus());
                System.out.println("Марка автобуса: " + bus.getBusBrand());
                res = true;
            }
        }
        if (!res) {
            System.out.println("Информация о данном маршруте отсутвствует. Возмржно такого маршрута нет.");
        }
    }

}
