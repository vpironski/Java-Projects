package airTransport;

public class Flights {
    private Route route;
    private String time_start;
    private String time_finale;
    private Airplane plane;

    public Flights(Route route, int hours_start, int minutes_start, int hours_finale, int minutes_finale, Airplane plane) {
        this.route = route;
        this.time_start = String.format("%d:%d",hours_start,minutes_start);
        this.time_finale = String.format("%d:%d",hours_finale,minutes_finale);
        this.plane = plane;
    }

    public Route getRoute() {
        return route;
    }

    public String getTime_start() {
        return time_start;
    }

    public String getTime_finale() {
        return time_finale;
    }

    public Airplane getPlane() {
        return plane;
    }

    public void setPlane(Airplane plane) {
        this.plane = plane;
    }
}
