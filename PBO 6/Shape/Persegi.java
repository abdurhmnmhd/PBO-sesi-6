package Shape;

public class Persegi implements Shape {
    private double side;

    public Persegi(double side){
        this.side = side;
    }

    public Double Luas(){
        return side * side;
    }

    public Double Keliling(){
        return 4 * side;
    }
}
