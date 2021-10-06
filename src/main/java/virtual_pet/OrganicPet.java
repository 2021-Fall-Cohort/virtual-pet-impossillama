package virtual_pet;

public class OrganicPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int sanitationLevel;

    public OrganicPet(String name, String description) {
        super(name, description);
        this.hungerLevel = (int) Math.floor(Math.random() * 100);
        this.thirstLevel = (int) Math.floor(Math.random() * 100);
        this.hungerLevel = (int)Math.floor(Math.random() * 100);
        this.sanitationLevel = (int) Math.floor(Math.random() * 100);
    }

    protected int getHungerLevel() {

        return hungerLevel;
    }

    public int getThirstLevel() {

        return thirstLevel;
    }

    public int getBoredomLevel() {

        return boredomLevel;
    }

    public int getSanitationLevel() {
        return sanitationLevel;
    }


    public  void play() {
        boredomLevel -= 15;
        hungerLevel += 5;
        thirstLevel += 5;
    }

    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;

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

    }
}
