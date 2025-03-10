import java.util.ArrayList;
import java.util.List;

public class Cart {

    // ArrayList of cart items
    private List<CartItem> items;

    // Constructor to initialize cart
    Cart(){
        this.items = new ArrayList<>();
    }

    // Method to add item to a cart
    public void addItem(String itemName, int itemPrice, int itemQuantity){
        this.items.add(new CartItem(itemName, itemPrice, itemQuantity));
    }

    // Method to remove first item by the item-name
    public void removeItem(String itemName){
        for(int i = 0 ; i < items.size() ; i++){
            if(items.get(i).getItemName().equalsIgnoreCase(itemName)){
                items.remove(i);
                return;
            }
        }
    }

    // Method to display total amount
    public void displayTotal(){
        int total = 0;
        for(int i = 0 ; i < this.items.size() ; i++){
            total += this.items.get(i).getAmount();
        }
        System.out.println("Total amount: " + total);
    }

}
/*
Cart cart = new Cart();
cart.addItem("socks", 500, 3);  //1500
cart.addItem("shoes", 7500, 2); //15000
cart.addItem("jeans", 3500, 2); //7000
cart.removeItem("socks");
cart.displayTotal();    // 1500 + 15000 + 7000 - 1500 = 22000

Total amount: 22000
 */