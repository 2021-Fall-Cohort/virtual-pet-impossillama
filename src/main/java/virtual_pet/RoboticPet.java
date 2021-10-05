package virtual_pet;

public abstract class RoboticPet extends VirtualPet {

    private int oilLevel;
    private int batteryCharge;

    public RoboticPet(String name, String description, int oilLevel, int batteryCharge) {
        super(name, description);
        this.oilLevel = oilLevel;
        this.batteryCharge = batteryCharge;
    }

    public void oil() {
        this.oilLevel += 5;
    }

    public void charge() {
        this.batteryCharge += 5;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }


}
