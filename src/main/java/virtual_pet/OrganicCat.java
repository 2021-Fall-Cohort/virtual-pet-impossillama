package virtual_pet;

public class OrganicCat extends OrganicPet implements Walkable{

    public OrganicCat(String name, String description) {
        super(name, description);

    }

    @Override
    public void walk() {
        this.boredomLevel -= 10;
    }
}
