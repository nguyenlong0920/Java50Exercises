package Exercise35;

public class Customer {
    private int id;
    private String name;
    private String address;
    private Bill bill;


    public Customer(int id, String name, String address, Bill bill) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.bill = bill;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", name = '" + name + '\'' +
                ", address = '" + address + '\'' +
                ", " + bill;
    }
}
