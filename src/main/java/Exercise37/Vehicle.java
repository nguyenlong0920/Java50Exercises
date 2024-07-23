package Exercise37;

public class Vehicle {
    private String id;
    private String manufacturer;
    private int manufactureYear;
    private double price;
    private String color;

    public Vehicle(String id, String manufacturer, int manufactureYear, double price, String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.manufactureYear = manufactureYear;
        this.price = price;
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
