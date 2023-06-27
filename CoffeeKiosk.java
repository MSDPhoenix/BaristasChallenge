import java.time.Year;
import java.util.ArrayList;

public class CoffeeKiosk {
    private ArrayList<Item> menu;
    private ArrayList<Order> orders;

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
        String itemNumber = "0";
        while(!itemNumber.equals("q") && !itemNumber.equals("")){
            System.out.println("\nPlease enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
            int itemNumberInt;
            try {
                itemNumberInt = Integer.parseInt(itemNumber);
            } catch (NumberFormatException e) {
                continue;
            }
            if (itemNumberInt < this.menu.size()+1){
                Item item = menu.get(itemNumberInt-1); 
                System.out.println(item.getName());
                order.addItem(item);
                for(Item oneItem:order.getItems()){
                    System.out.print(oneItem.getName()+" ");
                }
            }
        }
        order.display();
    }
    

    public void addMenuItemByInput(){
        String name = "x";
        while(!name.equals("q") && !name.equals("")){
            System.out.println("Please enter new menu item name or q for quit: ");
            name = System.console().readLine();
            if (name.equals("") || name.equals("q")){
                System.out.println("Okay, goodbye!");
                break;
            }
            System.out.print("Please enter new item price: $");
            String priceA = System.console().readLine();
            double priceB = Double.parseDouble(priceA);
            Item item = new Item(name,priceB);
            this.menu.add(item);
            item.setIndex(this.menu.size());
            this.displayMenu();
            // for(Item itemB:this.menu){
            //     System.out.println(itemB.getName()+" "+itemB.getPrice());
            // }
            




            // System.out.println(item.getName());
            // System.out.println(item.getPrice());

            
        }


    }
}
