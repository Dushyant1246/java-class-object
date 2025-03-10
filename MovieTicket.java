public class MovieTicket {

    // Fields
    private String movieName;
    private String seatNumber;
    private int price;

    // Constructor
    MovieTicket(String movieName){
        this.movieName = movieName;
    }

    // Method to book ticket with seat number and price
    public void bookTicket(String seatNumber, int price){
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void displayTicket(){
        System.out.println("Movie Name: " + this.movieName);
        System.out.println("Seat Number: " + this.seatNumber);
        System.out.println("Price: " + this.price);
    }
}
/*
MovieTicket movieTicket = new MovieTicket("Shrek 4");
movieTicket.bookTicket("A23", 500);
movieTicket.displayTicket();

Movie Name: Shrek 4
Seat Number: A23
Price: 500
 */
