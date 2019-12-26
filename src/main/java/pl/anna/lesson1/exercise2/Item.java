package pl.anna.lesson1.exercise2;

public class Item {

    private String name;
    private Category category;
    private Stock stock;
    private int currentQuantity;
    private int quantity;




    public Item(String name, Category category, Stock stock){
        this.name=name;
        this.category=category;
        this.stock=stock;
    }
    public String getName() {
        return name;
    }
    public void countQuantity(int quantity){
        this.quantity=quantity;

        currentQuantity=currentQuantity-quantity;
    }
    public void displayAllFields(){
        System.out.println(name+currentQuantity+quantity);

    }
    public void spendPieces(int quantity){


        System.out.println("Próba wydania "+quantity+" sztuk");

        if (currentQuantity< quantity) {
            System.out.println("Liczba sztuk przekracza aktualny stan, nie można wydać");
            System.out.println("Wydano: 0");

        } else {
            System.out.println("Wydano " + quantity + " sztuki");
        }
    }

    public void printItemDetails() {
            System.out.println("Nazwa: " + name);
            System.out.println("Nazwa kategorii: " + category.getName());
            System.out.println("Ilość stanu: " +currentQuantity + "/" + stock.getQuantity());
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", stock=" + stock +
                ", finalQuantity=" + currentQuantity +
                '}';
    }
}
