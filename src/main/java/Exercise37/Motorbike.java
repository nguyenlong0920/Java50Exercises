package Exercise37;

public class Motorbike extends Vehicle {
    private int horsePower;

    public Motorbike(String id, String manufacturer, int manufactureYear, double price, String color, int horsePower) {
        super(id, manufacturer, manufactureYear, price, color);
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return super.toString() + "Motorbike{" +
                "horsePower=" + horsePower +
                "} ";
    }
}
