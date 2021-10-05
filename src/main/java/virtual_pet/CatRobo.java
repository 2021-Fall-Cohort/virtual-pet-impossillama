package virtual_pet;

public class CatRobo extends RoboticPet{

    protected String metallicPurr;

    public CatRobo(String name, String description) {
        super(name, description);
        this.metallicPurr = metallicPurr;
    }
    public String getMetallicPurr() {

        return metallicPurr;
    }
}
