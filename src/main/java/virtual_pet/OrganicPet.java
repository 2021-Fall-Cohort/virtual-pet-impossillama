package virtual_pet;

public class OrganicPet extends VirtualPet {

    protected int hungerLevel;
    protected int thirstLevel;
    protected int sanitationLevel;

    public OrganicPet(String name, String description) {
        super(name, description);
        this.hungerLevel = (int) Math.floor(Math.random() * 100);
        this.thirstLevel = (int) Math.floor(Math.random() * 100);
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
        sanitationLevel += 5;
    }

    public void feed() {

        hungerLevel -= 15 ;
    }

    public void water() {

        thirstLevel -= 15;

    }

    public boolean cageDirty() {
        if(sanitationLevel <= 100 ){
            return true;
        }
        return false;

    }
    @Override
    public boolean isDead(){

        if (hungerLevel >= 100 || thirstLevel >= 100){
            return true;
        }
        return false;
    }

}
