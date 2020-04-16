public class Main {
    public static void main(String[] args) throws TriangleException {
        Wheel wheel = new Wheel(2.0);
        System.out.println("Wheel field: " +  wheel.getFiled());
        System.out.println("Wheel perimeter: " + wheel.getPerimeter());

        Square square = new Square(2.0);
        System.out.println("\nSquare field: " +  square.getFiled());
        System.out.println("Square perimeter: " + square.getPerimeter());

        Rectangle rectangle = new Rectangle(2.0, 10.0);
        System.out.println("\nRectangle field: " +  rectangle.getFiled());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

        try{
            Triangle triangle = new Triangle(1.0, 2.0, 1.1);
            System.out.println("\nTriangle field: " +  triangle.getFiled());
            System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
