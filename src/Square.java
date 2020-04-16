public class Square extends  Figure{
    private double a;

    public Square(double a){
        this.a = a;
    }

    public double getFiled(){
        return truncate(a * a, 2);
    }

    public double getPerimeter(){
        return truncate(4 * a, 2);
    }
}
