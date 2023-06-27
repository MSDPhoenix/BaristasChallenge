public class Test {
    public static void main(String[] args){
        CoffeeKiosk cafe = new CoffeeKiosk();
        cafe.addMenuItem("drip coffee", 2.37);
        cafe.addMenuItem("latte", 3.42);
        cafe.addMenuItem("cappuccino", 3.55);
        cafe.addMenuItem("machiato", 3.12);
        cafe.addMenuItem("mocha", 3.99);
        cafe.displayMenu();
        cafe.newOrder();
        cafe.addMenuItemByInput();
    }
}