package virtual_pet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;




public class VirtualPet extends VirtualPetApplication {
    private String name;
    private String description;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public VirtualPet(String name, String description){
        this.name = name;
        this.description = description;
        this.hungerLevel = 50;
//        this.hungerLevel = (int)Math.floor(Math.random() * 100);
        this.thirstLevel = (int)Math.floor(Math.random() * 100);
        this.boredomLevel = 90;
//        this.boredomLevel = (int)Math.floor(Math.random() * 100);

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

        hungerLevel -= 15 ;
    }

    public void water() {

        thirstLevel -= 15;

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

    public boolean isDead(){

        if (hungerLevel >= 100 || thirstLevel >= 100){
            return true;
        }
        return false;
    }

    public boolean isBored(){
        if (boredomLevel >= 100) {
            return true;
        }
        return false;
    }

}
