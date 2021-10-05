package virtual_pet;

public class DogRobo extends RoboticPet{

    protected String digitalBark;

    public DogRobo(String name, String description, int oilLevel, int batteryCharge, String digitalBark) {
        super(name, description, oilLevel, batteryCharge);
        this.digitalBark = digitalBark;
    }
    public String getDigitalBark() {
        return digitalBark;
    }
}
