package vehicles.air;

import parts.Radar;
import products.IProduct;
import products.Product;
import vehicles.IMotorised;
import vehicles.Vehicle;

public class PrivateJet extends Vehicle implements IMotorised, IAirVehicle {

    private int wheelCount;
    private int wingCount;
    private String radarType;
    private IMotorised engine;

    public PrivateJet(float weight, int maxSpeed, IProduct baseProduct, int wheelCount, int wingCount, String radarType, IMotorised engine) {
        super(weight, maxSpeed, baseProduct);
        this.wheelCount = wheelCount;
        this.wingCount = wingCount;
        this.radarType = radarType;
        this.engine = engine;
    }

    public void addRadar() {
        System.out.println("Adding radar");
        Radar radar = new Radar("C8", 208, new Product("C-Dawg",300,2),99);
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public String getRadarType() {
        return radarType;
    }

    public void setRadarType(String radarType) {
        this.radarType = radarType;
    }

    public IMotorised getEngine() {
        return engine;
    }

    public void setEngine(IMotorised engine) {
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        this.engine.startEngine();
    }

    @Override
    public void stopEngine() {
        this.engine.stopEngine();
    }

    @Override
    public int getHp() {
        return this.engine.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.engine.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.engine.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.engine.setFuel(fuel);
    }

    @Override
    public void takeOff() {
        System.out.println("Takeooooooooff!");
    }

    @Override
    public void land() {
        System.out.println("Smash!");
    }


}
