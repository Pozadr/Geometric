public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public double getFiled(){
        return truncate(a * h / 2, 2);
    }

    public double getPerimeter(){
        return truncate(a + b + c, 2);
    }
}
