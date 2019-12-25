package pl.anna.lesson1.exercise2;

public class Main {
    public static void main(String[] args) {

        Item item=new Item("Learn Java",new Category("Book"),new Stock(10));
        System.out.println("=====");
        item.spendPieces(5);
        item.printItemDetails();
        System.out.println("=====");
        item.spendPieces(6);
        item.printItemDetails();

    }


}
