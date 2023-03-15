package company;

public class Juice {
    private String name;
    private int price;
    private String man;
    private int qty;

    public Juice(String name, int price, String man, int qty) {
        this.name = name;
        this.price = price;
        this.man = man;
        this.qty = qty;
    }

    public void info(Juice juice){
        System.out.println(juice.getName());
        System.out.println(juice.getPrice());
        System.out.println(juice.getMan());
    }

    public void order(Juice juice, int input){
        if(juice.getQty() >= input){
            System.out.println("OK");
            juice.setQty(getQty() - input);
        }
        else{
            System.out.println("Not enought!");
        }
    }

    @Override
    public String toString() {
        return "Juice{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", man='" + man + '\'' +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMan() {
        return man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
