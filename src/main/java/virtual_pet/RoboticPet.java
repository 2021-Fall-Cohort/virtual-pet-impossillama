package virtual_pet;

public class RoboticPet extends VirtualPet {

    protected int oilLevel;
    protected int batteryCharge;

    public RoboticPet(String name, String description) {
        super(name, description);
        this.oilLevel = (int)Math.floor(Math.random() * 100);
        this.batteryCharge = (int)Math.floor(Math.random() * 100);
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

    public void chargeBattery() {
        this.batteryCharge +=10;
    }

    public void refillOil() {
        this.oilLevel += 10;
    }

    @Override
    public void play() {
        this.batteryCharge -= 10;
    }

    @Override
    public void tick() {
       oilLevel -=5;
       batteryCharge -= 5;

    }

    @Override

    public boolean isDead(){

        if (batteryCharge >= 100 || oilLevel >= 100){
            return true;
        }
        return false;
    }

}
