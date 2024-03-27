package Shape;

public class Lingkaran implements Shape {
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public Double Keliling() {
        
        return 2 * Math.PI * jarijari;
    }
    public Double Luas() {
        
        return Math.PI * jarijari * jarijari;
    }
    
}
