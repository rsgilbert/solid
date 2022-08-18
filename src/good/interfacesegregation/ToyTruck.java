package good.interfacesegregation;

public class ToyTruck implements Toy, Movable {
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
        System.out.println("The truck is moving on the road");
    }
}
