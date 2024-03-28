package Shape;

public class samakaki extends Segitiga{
    protected double alas;
    protected double tinggi;

    public samakaki (double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        super.setName("Segitiga Sama Kaki");
    }

    public double luas() {
        return ((alas/2)*tinggi)/2;
    }

    public double keliling() {
        double sm = Math.sqrt((alas/2)*(alas/2) + tinggi*tinggi);
        return 2 * sm + alas;
    }
}
