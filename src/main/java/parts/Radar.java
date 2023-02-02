package parts;

import products.IProduct;

public class Radar extends Part {

private int accuracy;


    public Radar(String manufacturer, long partNumber, IProduct baseProduct, int accuracy) {
        super(manufacturer, partNumber, baseProduct);
        this.accuracy = accuracy;
    }

    public void useRadar() {
    System.out.println("Scanning for enemies");
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
