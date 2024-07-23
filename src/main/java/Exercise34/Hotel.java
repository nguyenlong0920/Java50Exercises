package Exercise34;

public class Hotel {
    private int day;
    private char type;
    private Person person;

    public Hotel(int day, char type, Person person) {
        this.day = day;
        this.type = type;
        this.person = person;
    }

    public String getPersonId() {
        return person.getId();
    }

    public int getDay() {
        return day;
    }

    public char getType() {
        return type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setPersonId(String personId) {
        this.person.setId(personId);
    }

    public int price() {
        int price = day;

        switch (type) {
            case 'A':
                price *= 500;
                break;
            case 'B':
                price *= 300;
                break;
            case 'C':
                price *= 100;
                break;
        }

        return price;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "day=" + day +
                ", type=" + type +
                ", person=" + person +
                '}';
    }
}
