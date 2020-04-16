public class Wheel extends  Figure {
    private double r;

    public Wheel(double r){
        this.r = r;
    }

    public double getFiled(){
        return truncate(Math.PI * r * r,2);
    }

    public double getPerimeter(){
        return truncate(2 * Math.PI * r, 2);
    }

}
