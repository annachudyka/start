package pl.anna.lesson1.exercise2;

public class Stock {

    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "quantity=" + quantity +
                '}';
    }
}
