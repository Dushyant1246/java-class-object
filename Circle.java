// class definition
public class Circle {
    // Fields
    private double radius;

    // Constructor to initialize values
    Circle(double radius){
        this.radius = radius;
    }

    // Method to calculate circumference
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    // Method to calculate area
    public double getArea(){
        return Math.PI * radius * radius;
    }

    // Method to display circumference
    public void displayCircumference(){
        System.out.printf("Circumference of circle: %.2f\n", this.getCircumference());
    }

    // Method to display area
    public void displayArea(){
        System.out.printf("Area of circle: %.2f\n", this.getArea());
    }
}
/*
Circle circle = new Circle(12.5);
circle.displayArea();
circle.displayCircumference();

Area of circle: 490.87
Circumference of circle: 78.54
 */
