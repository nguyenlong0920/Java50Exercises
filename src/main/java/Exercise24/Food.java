package Exercise24;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Food {
    private int id;
    private String name;
    private String manufactureDate;
    private String expirationDate;

    public Food(int id, String name, String manufactureDate, String expirationDate) {
        this.id = id;
        this.name = name;
        this.manufactureDate = manufactureDate;
        this.expirationDate = expirationDate;
    }
    public Food(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean checkExpirationDate(String currentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate inputDate = LocalDate.parse(currentDate, formatter);
        LocalDate thisExpirationDate = LocalDate.parse(this.expirationDate, formatter);
        return inputDate.isEqual(thisExpirationDate) || inputDate.isAfter(thisExpirationDate);
    }

    @Override
    public String toString() {
        return String.format("%-5d%-15s%-15s%-15s", id, name, manufactureDate, expirationDate);
    }
}
