public class Ball {
    private String shape = "шар";
    private int r = 1;
    private double Pi = 3.14;

    public String getShape() {
        return shape;
    }

    public Double Square(int r){
        double S = 4 * Pi * (r * r);
        return S;
    }
}
