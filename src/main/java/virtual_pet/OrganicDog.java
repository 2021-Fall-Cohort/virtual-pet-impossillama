package virtual_pet;

public class OrganicDog extends OrganicPet implements Walkable {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int sanitationLevel;

    public OrganicDog (String name, String description, int hungerLevel, int thirstLevel, int sanitationLevel) {
        super(name, description);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.sanitationLevel = sanitationLevel;

    }
    public void feed() {
        hungerLevel += 5;
    }
    public void water() {
        thirstLevel += 5;
    }
    public void play() {
        boredomLevel += 5;
    }
    public void walk() {
        sanitationLevel -= 5;
    }
    @Override
    public void tick() {

    }
    }
}



