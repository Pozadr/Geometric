public class TriangleException extends Exception {

    @Override
    public String getMessage() {
        return "Can't create a Triangle class object. Wrong input data.";
    }
}
