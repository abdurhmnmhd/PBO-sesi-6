package Geometri;

import Shape.Persegi;

public class kubus extends Persegi implements geometri {
    private double tinggi;

    public kubus(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

    @Override
    public double calculateVolume() {
        return Luas() * tinggi;
    }

    @Override
    public double calculatePermukaan() {
        return 6 * Luas();
    }
}
    

