package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public final class Kayak extends Vehicle implements IWaterVehicle {

    private String hullType;

    public Kayak(float weight, int maxSpeed, IProduct baseProduct, String hullType) {
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public float getPrice() {
        return this.getPrice();
    }

    @Override
    public long getInventory() {
        return this.getInventory();
    }

    @Override
    public void setPrice(float price) {
        this.setPrice(price);
    }

    @Override
    public void setInventory(long amount) {
        this.setInventory(amount);

    }

    @Override
    public void setTitle(String title) {
        this.setTitle(title);
    }

    @Override
    public String getTitle() {
        return this.getTitle();
    }

    @Override
    public void addInventory(long amount) {
        this.addInventory(amount);
    }

    @Override
    public void removeInventory(long amount) throws Exception {

    } // do we need an if statement here?

    @Override
    public float getWeight() {
        return this.getWeight();
    }

    @Override
    public int getMaxSpeed() {
        return this.getMaxSpeed();
    }

    @Override
    public void setWeight(float weight) {
        this.setWeight(weight);
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.setMaxSpeed(speed);
    }

    @Override
    public String getHullType() {
        return this.hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;

    }
}
