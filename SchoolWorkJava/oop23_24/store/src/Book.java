public class Book extends Stock{
    private String author;
    private String title;


    public Book(int uniqueID, double price, String author, String title) {
        super(uniqueID, price);
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double checkPromo(double percent) throws PriceException {
        if (percent < 0) {
            throw new PriceException("Invalid percentile");
        } else if (this.getPrice() < 0) {
            throw new PriceException("Price can not be below 0");
        } else {
            return this.getPrice() * percent;
        }
    }
}
