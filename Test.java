public class Test {
    public static void main(String[] args){
        CoffeeKiosk cafe = new CoffeeKiosk();
        cafe.addItem("drip coffee", 2.37);
        cafe.addItem("latte", 3.42);
        cafe.addItem("cappuccino", 3.55);
        cafe.addItem("machiato", 3.12);
        cafe.addItem("mocha", 3.99);
        cafe.displayMenu();
        cafe.newOrder();
    }
}