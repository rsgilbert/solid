package bad.interfacesegregation;

public class IntSegMain {
    public static void main(String[] args) {
        System.out.println("House");
        Toy house = new ToyHouse();
        house.move();
        house.fly();
        System.out.println("House end");

        System.out.println("Plane");
        ToyPlane plane = new ToyPlane();
        plane.move();
        plane.fly();
        System.out.println("Plane end");

        System.out.println("Truck");
        ToyTruck truck = new ToyTruck();
        truck.move();
        truck.fly();
        System.out.println("Truck end");
    }
}
