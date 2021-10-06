package virtual_pet;



public abstract class VirtualPet {
    protected String name;
    protected String description;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        this.boredomLevel = (int) Math.floor(Math.random() * 100);

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

    public int getBoredomLevel() {
        return boredomLevel;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }


    public abstract void tick();

    public abstract void play();


}
