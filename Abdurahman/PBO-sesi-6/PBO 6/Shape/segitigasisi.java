package Shape;

public class segitigasisi extends Segitiga{
    protected double alas;
    protected double tinggi;

    public segitigasisi (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        super.setName("Segitiga Sama Sisi");
    }

    public double luas() {
        return ((alas/2)*tinggi)/2;
    }

    public double keliling() {
        return 3 * alas;
    }
}