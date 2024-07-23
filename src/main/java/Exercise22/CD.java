package Exercise22;

public class CD {
    private int id;
    private String name;
    private String singer;
    private int number;
    private double price;

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSinger () {
        return singer;
    }

    public void setSinger () {
        this.singer = singer;
    }

    public int getNumber () {
        return number;
    }

    public void setNumber (int number) {
        this.number = number;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public CD (int id, String name, String singer, int number, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.number = number;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nSinger: " + singer + "\nNumber: " + number + "\nPrice: " + price;
    }
}
