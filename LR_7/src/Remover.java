import java.util.Iterator;
import java.util.Map;

public class Remover {
    private RouteStorage busTrip;

    public Remover(RouteStorage pBusTrip) {
        this.busTrip = pBusTrip;
    }

    public void removeByRoute(String numberTrip) {
        for (Iterator<Map.Entry<BusInfo, RouteInfo>> iter = busTrip.getData().entrySet().iterator();
        iter.hasNext();) {
            Map.Entry<BusInfo, RouteInfo> entry = iter.next();
            if (entry.getKey().getNumberTrip().equals(numberTrip)) {
                iter.remove();
                System.out.println("Маршрут удалён!");
            }
        }
    }
}
