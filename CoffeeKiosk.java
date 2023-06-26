import java.time.Year;
import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private  ArrayList<Order> orders;

    public  CoffeeKiosk(){
        this.menu = new ArrayList<Item>();
        this.orders = new ArrayList<Order>();
    }
    public void addMenuItem(String name, double price){
        Item item = new Item(name,price);
        this.menu.add(item);
        item.setIndex(menu.size());
    }
    public void displayMenu(){
        System.out.println("");
        for(Item item:this.menu){
            // Item item = menu.get(i);
            System.out.print(item.getIndex());
            System.out.print(" "+item.getName());
            for(int j=0; j<15-item.getName().length();j++){
                System.out.print(" ");
            }
            System.out.println(item.getPrice());
        }
        System.out.println("");

    }
    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        // Create new Order Object
        Order order = new Order(name);
        displayMenu();
        String itemNumber = "";
        while(!itemNumber.equals("q")){
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            int itemNumberInt;
            try {
                itemNumberInt = Integer.parseInt(itemNumber);
            } catch (NumberFormatException e) {
                continue;
            }
            if (itemNumberInt < this.menu.size()+1){
                Item item = menu.get(itemNumberInt-1); 
                System.out.println("A "+item.getName());
                order.addItem(item);
                for(Item oneItem:order.getItems()){
                    System.out.print(oneItem.getName()+" ");
                }
            }
        }
        order.display();





            // item
            // add item to order

            // ask them to enter a new item



        

        }
        //  print order details
    public void addMenuItemByInput(){
            
    }
}
