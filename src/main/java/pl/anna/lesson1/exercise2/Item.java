package pl.anna.lesson1.exercise2;

public class Item {

    private String name;
    private Category category;
    private Stock stock;
    private int quantity;
    private int currentQuantity;



    public Item(String name, Category category, Stock stock){
        this.name=name;
        this.category=category;
        this.stock=stock;
    }
    public Item(int currentQuantity){
        this.currentQuantity=currentQuantity;
    }

    public String getName() {
        return name;
    }

    public void spendPieces(int quantity){

        this.quantity=quantity;

        System.out.println("Próba wydania "+quantity+" sztuk");
    }

    public void printItemDetails() {

        int currentQuantity = stock.getQuantity() - quantity;

        if (currentQuantity < quantity) {
            System.out.println("Liczba sztuk przekracza aktualny stan, nie można wydać");
            System.out.println("Ilość stanu: 0");
        } else {
            System.out.println("Wydano " + quantity + " sztuki");
            System.out.println("Nazwa: " + name);
            System.out.println("Nazwa kategorii: " + category.getName());
            System.out.println("Ilość stanu: " + currentQuantity + "/" + stock.getQuantity());
        }
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", stock=" + stock +
                ", quantity=" + quantity +
                '}';
    }
}
