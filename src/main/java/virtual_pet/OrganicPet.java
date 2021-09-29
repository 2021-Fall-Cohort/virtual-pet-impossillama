package virtual_pet;

public abstract class OrganicPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public OrganicPet(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, description);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }
}
