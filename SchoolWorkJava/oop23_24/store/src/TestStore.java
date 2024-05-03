public class TestStore {
    public static void main(String[] args) {
        try {
            Book book = new Book(1,14.99,"Maya Silver","Whispers in the Wind");
            TV tv = new TV(2,999.99,"TechnoVision","VZ-9000", 120.00);
        }catch(PriceException e){
            System.err.println(e.getMessage());
        }
    }
}
