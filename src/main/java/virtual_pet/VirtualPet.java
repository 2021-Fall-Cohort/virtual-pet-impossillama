package virtual_pet;



public abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int boredomLevel;


    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        this.boredomLevel = (int) Math.floor(Math.random() * 50);


    }


    public int getBoredomLevel() {
        return boredomLevel;
    }

    public String getName() {

        return name;
    }

    public String getDescription(){

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }




    public void setName(String name) {

        this.name = name;
    }





    public abstract void tick();

    public abstract void play();

    public abstract boolean isDead();

    public abstract String petRow();
}
