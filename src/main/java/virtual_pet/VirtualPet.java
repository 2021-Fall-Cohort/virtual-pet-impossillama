package virtual_pet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;




public abstract class VirtualPet extends VirtualPetApplication {
    private String name;
    private String description;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int boredomLevel;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        this.hungerLevel = (int)Math.floor(Math.random() * 100);
        this.thirstLevel = (int)Math.floor(Math.random() * 100);
        this.boredomLevel = (int)Math.floor(Math.random() * 100);

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

    public int getHungerLevel() {

        return hungerLevel;
    }

    public int getThirstLevel() {

        return thirstLevel;
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

    public void feed() {

        this.hungerLevel = Math.min(0,hungerLevel-15);
        this.hungerLevel = Math.max(100, hungerLevel -15);
    }

    public void water() {

        this.thirstLevel = Math.min(0, thirstLevel-15);

    }

    public  void play() {
        this.boredomLevel = Math.min(0, boredomLevel-10);
        this.hungerLevel = Math.max(100, hungerLevel +5);
        this.thirstLevel = Math.max(100, thirstLevel +5);
    }

    public void tick() {
        this.hungerLevel = Math.min(100,hungerLevel+5);
        this.thirstLevel = Math.min(100, thirstLevel+5);
        this.boredomLevel = Math.min(100, boredomLevel+5);

    }
    public boolean isDead(){

        if (hungerLevel == 100 || thirstLevel == 100){
            return true;
        }
        else if(boredomLevel == 100){
            return true;
        }
        return false;
    }
}
