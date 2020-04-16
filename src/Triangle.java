public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c) throws TriangleException {
        if((a + b) > c && (a + c) > b && (b + c) > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            throw new TriangleException();
        }
    }

    public double getFiled(){
        // Heron formula
        double p = (a + b + c) / 2;
        return truncate((Math.sqrt(p * (p - a) * (p - b) * (p - c))), 2);
    }

    public double getPerimeter(){
        return truncate(a + b + c, 2);
    }
}
