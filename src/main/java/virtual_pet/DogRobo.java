package virtual_pet;

public class DogRobo extends RoboticPet{

    protected String digitalBark;

    public DogRobo(String name, String description) {
        super(name, description);
        this.digitalBark = digitalBark;
    }


    public String getDigitalBark() {

        return digitalBark;
    }
}
