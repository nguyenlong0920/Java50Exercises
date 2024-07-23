package Exercise35;

public class Bill {
    private int before;
    private int after;

    public Bill(int before, int after) {
        this.before = before;
        this.after = after;
    }

    public int getBefore() {
        return before;
    }

    public void setBefore(int before) {
        this.before = before;
    }

    public int getAfter() {
        return after;
    }

    public void setAfter(int after) {
        this.after = after;
    }

    public int calculateTotal() {
        return (after - before) * 5;
    }

    @Override
    public String toString() {
        int total = calculateTotal();
        return "before = " + before +
                ", after = " + after +
                ", total = " + total;
    }
}
