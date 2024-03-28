package Geometri;

public class bola  implements geometri {
    private double radius;

    public bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculatePermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
    

