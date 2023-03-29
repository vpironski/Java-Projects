package airTransport;

public class Route {
    private String start;
    private String finale;
    private int distance;
    private String time;

    public Route(String start, String finale, int distance, int hours, int minutes) {
        this.start = start;
        this.finale = finale;
        this.distance = distance;
        this.time = String.format("%d:%d",hours,minutes);
    }

    public String getStart() {
        return start;
    }

    public String getFinale() {
        return finale;
    }

    public int getDistance() {
        return distance;
    }

    public String getTime() {
        return time;
    }
}
