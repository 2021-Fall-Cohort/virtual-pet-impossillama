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

    public void feed(int newHungerLevel) {
        this.hungerLevel = newHungerLevel;
    }

    public void water(int newThirstLevel) {
        this.thirstLevel = newThirstLevel;
    }

    public  void play(int newBoredomLevel) {
        this.boredomLevel = newBoredomLevel;
    }


}
