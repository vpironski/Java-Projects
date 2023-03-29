package airTransport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crew {
    private String pilot;
    private String co_pilot;
    private String navigator;
    private List<String> flight_attendants = new ArrayList<>();

    public Crew(String pilot, String co_pilot, String navigator, String[] attendants) {
        this.pilot = pilot;
        this.co_pilot = co_pilot;
        this.navigator = navigator;
        this.flight_attendants = Arrays.asList(attendants);
    }

    public Crew(String pilot, String co_pilot, List<String> flight_attendants) {
        this.pilot = pilot;
        this.co_pilot = co_pilot;
        this.flight_attendants = flight_attendants;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }

    public String getCo_pilot() {
        return co_pilot;
    }

    public void setCo_pilot(String co_pilot) {
        this.co_pilot = co_pilot;
    }

    public String getNavigator() {
        return navigator;
    }

    public void setNavigator(String navigator) {
        this.navigator = navigator;
    }

    public List<String> getFlight_attendants() {
        return flight_attendants;
    }

    public void setFlight_attendants(List<String> flight_attendants) {
        this.flight_attendants = flight_attendants;
    }
}
