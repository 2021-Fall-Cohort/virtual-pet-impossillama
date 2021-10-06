package virtual_pet;

import java.util.ArrayList;

public abstract class OrganicPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int sanitationLevel;

    public OrganicPet(String name, String description, int hungerLevel, int thirstLevel, int sanitationLevel) {
        super(name, description);

        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sanitationLevel = sanitationLevel;
        this.hungerLevel = (int) Math.floor(Math.random() * 100);
        this.thirstLevel = (int) Math.floor(Math.random() * 100);
        this.sanitationLevel = (int) Math.floor(Math.random() * 100);
    }

    @Override
    public void feed() {
        this.hungerLevel += 5;
    }
    @Override
    public void water() {
        this.thirstLevel += 5;
    }
    @Override
    public boolean isDead() {
        return super.isDead();








//        ArrayList<OrganicPet> organicShelter = new ArrayList<>();
//        organicShelter.add(new OrganicDog("roofus", "is a peppy liitle puppers!");



    }
}
