public interface Shapes {

 /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
 
     */

    public double calculateArea ();
    public double calculatePerimiter ();
}

class Circle implements Shapes {
    int radius;
    // A=πr2 area
    // C=2πr circumfernce= perimeter

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public double calculatePerimiter() {
        return Math.PI * 2 * radius;
    }
}

class Square implements Shapes {
    public Square(int side) {
        this.side = side;
    }

    int side;
    // A=a2 area
    // P=4a perimeter
    @Override
    public double calculateArea() {
        return side * 2 ;
    }

    @Override
    public double calculatePerimiter() {
        return side *4 ;
    }
}
class ShapesTester {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateArea());
        Square square = new Square(6);
        System.out.println(square.calculateArea());
        System.out.println( square.calculatePerimiter());
    }
}
