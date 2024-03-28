package Shape;

public class persegipanjang implements Shape{
    private Double panjang;
    private Double lebar;

    public persegipanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public Double Keliling() {
        
        return 2 * (panjang + lebar);
    }

    @Override
    public Double Luas() {

        return panjang * lebar;
    }
    
}
