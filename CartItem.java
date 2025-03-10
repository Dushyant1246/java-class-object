public class CartItem {

    // Fields
    private String itemName;
    private int price;
    private int quantity;

    // Constructor to initialize item
    CartItem(String itemName, int price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get total amount
    public int getAmount() {
        return price * quantity;
    }

    // Method to get item-name
    public String getItemName() {
        return itemName;
    }
}
