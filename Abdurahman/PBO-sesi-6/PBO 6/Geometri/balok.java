package Geometri;

public class balok implements geometri {
    private double panjang;
    private double lebar;
    private double tinggi;

    public balok (double panjang, double lebar, double tinggi) {
        
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double calculatePermukaan() {
        
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    @Override
    public double calculateVolume() {
        
        return panjang * lebar *tinggi;
    }
    
}
