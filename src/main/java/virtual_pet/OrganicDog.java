package virtual_pet;

public class OrganicDog extends OrganicPet implements Walkable {

    public OrganicDog (String name, String description) {
        super(name, description);
    }

    @Override
    public void walk() {
        this.boredomLevel -= 10 ;
        this.hungerLevel += 10;
        this.thirstLevel += 10;
        this.sanitationLevel -= 10;
    }
}




