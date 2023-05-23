import java.util.ArrayList;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public  CoffeeKiosk(){
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }
    public void addItem(String name, double price){
        Item item = new Item(name,price);
        this.menu.add(0, item);
        item.setIndex(menu.size());
    }
    public void displayMenu(){
        for(int i=menu.size()-1; i>=0; i--){
            Item item = menu.get(i);
            System.out.print("\n"+item.getIndex());
            System.out.print(" "+item.getName());
            for(int j=0; j<15-item.getName().length();j++){
                System.out.print(" ");
            }
            System.out.println(item.getPrice()+"\n");
        }
    }
    public void newOrder(){
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();

        // Create new Order Object



        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        while(!itemNumber.equals("q")){
            int itemNumberInt = Integer.parseInt(itemNumber);
            // get item object from menu
            Item item = menu.get(itemNumberInt);
            System.out.println(item.getName());

        }
            // add item to order

            // ask them to enter a new item



        

        }
        //  print order details
    public void addMenuItemByInput(){
            
    }
}
