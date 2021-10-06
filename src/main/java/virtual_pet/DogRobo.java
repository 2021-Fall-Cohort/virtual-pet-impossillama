package virtual_pet;

public class DogRobo extends RoboticPet implements Walkable{

    protected String digitalBark;

    public DogRobo(String name, String description) {
        super(name, description);
    }

    @Override
    public void walk() {
        this.oilLevel -= 10;
        this.batteryCharge -= 10;
        this.boredomLevel -= 10;
    }
}
