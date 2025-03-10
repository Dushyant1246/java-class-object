public class MobilePhone {

    // Fields
    private String brand;
    private String model;
    private int price;

    // Constructor to initialize data
    MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display data
    public void displayDetails(){
        System.out.println("Phone brand: " + this.brand);
        System.out.println("Phone model: " + this.model);
        System.out.println("Phone price: " + this.price);
    }
}
/*
MobilePhone mobilePhone = new MobilePhone("Samsung", "Z Fold", 66000);
mobilePhone.displayDetails();

Phone brand: Samsung
Phone model: Z Fold
Phone price: 66000
 */