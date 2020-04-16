public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getFiled(){
        return truncate(a * b, 2);
    }

    public double getPerimeter(){
        return truncate(2 * a + 2 * b, 2);
    }
}
