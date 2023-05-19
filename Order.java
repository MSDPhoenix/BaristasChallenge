import java.lang.reflect.Array;
import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<>();
    }
    public Order(String name){
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        } else {
            return "Thank you for waiting.  Your order will be ready soon.";
        }
    }
    public double getTotal(){
        double total = 0.0;
        for(Item item:this.items){
            total += item.getPrice();
        }
        return total;
    }
    public void display(){
        System.out.printf("\n*%s*\n",this.name);
        for(Item item : this.items){
            String itemName =item.getName();
                itemName +=" ".repeat(14 - itemName.length());
            System.out.println(itemName+item.getPrice());
        }
    }

    public String getName(){
        return this.name;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public boolean isReady(){
        return this.ready;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setReady(boolean ready){
        this.ready = ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
}