package virtual_pet;

public class CatRobo extends RoboticPet{

    protected String metallicPurr;

    public CatRobo(String name, String description, int oilLevel, int batteryCharge, String metallicPurr) {
        super(name, description, oilLevel, batteryCharge);
        this.metallicPurr = metallicPurr;
    }
    public String getMetallicPurr() {
        return metallicPurr;
    }
}
