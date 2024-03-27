package Shape;

public abstract class Segitiga implements Shape {
    protected double alas;
    protected double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public abstract double calculateLuas();
    public abstract double calculateKeliling();
    
}
