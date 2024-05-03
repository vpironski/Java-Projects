public class Album {
    private String device;
    private String band;
    private int year;
    private int tracks;

    public Album(String device, String band, int year, int tracks) {
        this.device = device;
        this.band = band;
        this.year = year;
        this.tracks = tracks;
    }

    public Album(){
        this.device = "CD";
        this.band = "Skid row";
        this.year = 1998;
        this.tracks = 8;
    }

    public int getTracks() {
        return tracks;
    }
    public String getDevice(){
        return device;
    }

    public String getBand() {
        return band;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Album{" +
                "device='" + device + '\'' +
                ", band='" + band + '\'' +
                ", year=" + year +
                ", tracks=" + tracks +
                '}';
    }
}
