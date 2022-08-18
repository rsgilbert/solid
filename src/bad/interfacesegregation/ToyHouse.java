package bad.interfacesegregation;

public class ToyHouse implements Toy {
    private double price;
    private String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void move() {
        System.out.println("I dont move");
    }

    @Override
    public void fly() {
        System.out.println("I dont fly");
    }
}
