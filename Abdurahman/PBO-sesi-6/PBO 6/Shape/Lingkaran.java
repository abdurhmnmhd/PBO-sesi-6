package Shape;

public class Lingkaran implements Shape {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    public Double Keliling() {
        
        return 2 * Math.PI * radius;
    }
    public Double Luas() {
        
        return Math.PI * radius * radius;
    }
    
}
