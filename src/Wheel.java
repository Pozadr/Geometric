public class Wheel {
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

    private double truncate(double number, int precision)
    {
        double prec = Math.pow(10, precision);
        int integerPart = (int) number;
        double fractionalPart = number - integerPart;
        fractionalPart *= prec;
        int fractPart = (int) fractionalPart;
        fractionalPart = (double) (integerPart) + (double) (fractPart)/prec;
        return fractionalPart;
    }
}
