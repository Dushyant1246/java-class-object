public class Item {

    // Fields
    private String itemCode;
    private String itemName;
    private int price;

    // Constructor
    Item(String itemCode, String itemName, int price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayItemDetails(){
        System.out.println("Item code: " + this.itemCode);
        System.out.println("Item Name: " + this.itemName);
        System.out.println("Item Price: " + this.price);
    }

    // Method to get total cost for quantity
    public int getTotalCostQuantity(int quantity){
        return price * quantity;
    }
}
/*
Item item = new Item("101", "Shoes", 20000);
item.displayItemDetails();
System.out.println("Total price for 23 items: " + item.getTotalCostQuantity(23));

Item code: 101
Item Name: Shoes
Item Price: 20000
Total price for 23 items: 460000
 */