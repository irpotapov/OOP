import java.util.Hashtable;

public class RouteStorage {
    private Hashtable<BusInfo, RouteInfo> data;

    public Hashtable<BusInfo, RouteInfo> getData() {
        return data;
    }

    public RouteStorage() {
        data = new Hashtable<BusInfo, RouteInfo>();
        data.put(new BusInfo("606", "Mersedes", "р569во"),
                new RouteInfo("Ставрополь-Краснодар", "12.05.2023", "13:10"));
        data.put(new BusInfo("340", "Ford", "в809пн"),
                new RouteInfo("Ставрополь-Пятигорск", "03.05.2023", "08:05"));
        data.put(new BusInfo("59", "Mersedes", "о110ср"),
                new RouteInfo("Ставрополь-Краснодар", "11.05.2023", "10:25"));
    }
}
