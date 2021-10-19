package virtual_pet;

public class RoboticPet extends VirtualPet {

    protected int oilLevel;
    protected int batteryCharge;

    public RoboticPet(String name, String description) {
        super(name, description);
        this.oilLevel = (int)Math.floor(Math.random() * 50);
        this.batteryCharge = (int)Math.floor(Math.random() * 50);
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



    public void refillOil() {

        this.oilLevel += 10;
    }


    @Override
    public void play() {

        this.batteryCharge += 10;
    }

    @Override
    public void tick() {
       oilLevel -=5;
       batteryCharge -= 5;

    }


    public boolean isDead(){

        if (batteryCharge <= 0 || oilLevel <= 0){
            return true;
        }
        return false;
    }

    @Override
    public String petRow() {
        return name + " | Oil Level: " + oilLevel + " | Battery Level: " + batteryCharge +  " | Boredom: " + getBoredomLevel() + "| Description: " + description;
    }

}
