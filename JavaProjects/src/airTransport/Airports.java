package airTransport;

import java.util.List;

public class Airports {
    private List<Airplane> airplanes;
    private List<Route> routes;
    private List<Flights> flights;

    public Airports(List<Airplane> airplanes, List<Route> routes, List<Flights> flights) {
        this.airplanes = airplanes;
        this.routes = routes;
        this.flights = flights;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public List<Flights> getFlights() {
        return flights;
    }

    public void setFlights(List<Flights> flights) {
        this.flights = flights;
    }
}
