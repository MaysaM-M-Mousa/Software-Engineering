public class Fruit {

    private String name;
    private int price;

    public Fruit() {
        this.name="";
        this.price=0;
    }

    public Fruit(String name, int price) {
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setPrice(int price) {
        this.price=price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

}
