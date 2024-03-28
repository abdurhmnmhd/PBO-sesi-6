package Geometri;

public class tabung implements geometri {
    private double radius;
    private double tinggi;

    public tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * tinggi;
    }

    @Override
    public double calculatePermukaan() {
        return (2 * Math.PI * radius * tinggi) + (2 * Math.PI * Math.pow(radius, 2));
    }
}
    

