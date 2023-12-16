import java.sql.Time;
import java.util.Date;

public class RouteInfo {
    private String route;
    private String day;
    private String time;

    public RouteInfo(String pRout, String pDay, String pTime) {
        route = pRout;
        day = pDay;
        time = pTime;
    }

    public String getRoute() {
        return route;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }
}
