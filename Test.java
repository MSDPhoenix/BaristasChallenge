public class Test {
    public static void main(String[] args){
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Pam");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Dan");
        Item item1 = new Item("Cappuccino",3.55);
        Item item2 = new Item("Latte",3.45);
        Item item3 = new Item("Machiato",3.25);
        Item item4 = new Item("Mocha",3.65);
        Item item5 = new Item("Drip Coffee",1.55);
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item5);
        order3.addItem(item1);
        order4.addItem(item2);
        order4.addItem(item3);
        order5.addItem(item4);
        order5.addItem(item5);
        order1.setReady(true);
        order2.setReady(true);
        order1.display();
        System.out.println("Order1 total: "+order1.getTotal());
        System.out.println(order1.getStatusMessage());
        order2.display();
        System.out.println("Order2 total: "+order2.getTotal());
        System.out.println(order2.getStatusMessage());
        order3.display();
        System.out.println("Order3 total: "+order3.getTotal());
        System.out.println(order3.getStatusMessage());
        order4.display();
        System.out.println("Order4 total: "+order4.getTotal());
        System.out.println(order4.getStatusMessage());
        order5.display();
        System.out.println("Order5 total: "+order5.getTotal());
        System.out.println(order5.getStatusMessage());
    }
}