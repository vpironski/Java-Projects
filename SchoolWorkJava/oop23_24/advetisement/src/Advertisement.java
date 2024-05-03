public class Advertisement {
    private String title;
    private String contents;
    private String name;
    private String phoneNumber;
    private String town;
    private double price;
    private String category;

    public Advertisement(String title, String contents, String name, String phoneNumber, String town, double price, String category) {
        this.title = title;
        this.contents = contents;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.town = town;
        this.price = price;
        this.category = category;
    }

    public Advertisement() {
        this.title = "Selling my old Porsche";
        this.contents = "Selling my old Porsche 911 targa 1980";
        this.name = "Vihren Pironski";
        this.phoneNumber = "0877063406";
        this.town = "Sofia";
        this.price = 39999.99;
        this.category = "Cars";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", town='" + town + '\'' +
                ", price=" + price +
                '}';
    }
}
