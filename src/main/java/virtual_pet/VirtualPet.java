package virtual_pet;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;




public class VirtualPet {
    private String name;
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;

    public VirtualPet(String name, int hungerLevel, int thirstLevel, int boredomLevel){
        this.name = name;
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.boredomLevel = boredomLevel;

    }

    public String getName() {

        return name;
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

        this.hungerLevel = Math.max(0,hungerLevel-15);
        tick();
    }

    public void water() {

        this.thirstLevel = Math.max(0, thirstLevel-15);
        tick();
    }

    public  void play() {
        this.boredomLevel = Math.max(0, boredomLevel-10);
        tick();
    }

    public void tick() {
        this.hungerLevel = Math.min(100,hungerLevel+5);
        this.thirstLevel = Math.min(100, thirstLevel+5);
        this.boredomLevel = Math.min(100, boredomLevel-5);


    }

}
