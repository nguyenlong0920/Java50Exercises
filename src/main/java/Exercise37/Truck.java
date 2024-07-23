package Exercise37;

public class Truck extends Vehicle {
    private int payLoad;

    public Truck(String id, String manufacturer, int manufactureYear, double price, String color, int payLoad) {
        super(id, manufacturer, manufactureYear, price, color);
        this.payLoad = payLoad;
    }

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return super.toString() + "Truck{" +
                "Pay load=" + payLoad +
                "} ";
    }
}
