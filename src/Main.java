public class Main {
    public static void main(String[] args){
        Wheel wheel = new Wheel(2.0);
        System.out.println("Wheel field: " +  wheel.getFiled());
        System.out.println("Wheel perimeter: " + wheel.getPerimeter());

        Square square = new Square(2.0);
        System.out.println("\nSquare field: " +  square.getFiled());
        System.out.println("Square perimeter: " + square.getPerimeter());

    }
}
