package Exercise37;

public class Car extends Vehicle {
    private int seat;
    private String engine;

    public Car(String id, String manufacturer, int manufactureYear, double price, String color, int seat, String engine) {
        super(id, manufacturer, manufactureYear, price, color);
        this.seat = seat;
        this.engine = engine;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "seat=" + seat +
                ", engine='" + engine + '\'' +
                "} ";
    }
}
