package virtual_pet;

public class OrganicCat extends OrganicPet implements Walkable{

    public OrganicCat(String name, String description, int hungerLevel, int thirstLevel, int boredomLevel) {
        super(name, description, hungerLevel, thirstLevel, boredomLevel);
    }

    @Override
    public void feed() {
        super.feed();
    }

    @Override
    public void water() {
        super.water();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void walk() {

    }
}
