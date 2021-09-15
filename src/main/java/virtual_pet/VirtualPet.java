package virtual_pet;
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

  public void gettingStarted() {
        Scanner input =  new Scanner(System.in);
        String inputNum;

        System.out.println("To get started with my care, what would you like to check first? ");
        System.out.println("Please enter 1 to check my hunger level");
        System.out.println("Please enter 2 to check my thirst level");
        System.out.println("Please enter 3 to check my boredom level");
        inputNum = input.nextLine();

        if (Integer.parseInt(inputNum) == 1){
            System.out.println("My hunger level is "  + getHungerLevel());
        } else if (Integer.parseInt(inputNum) == 2) {
            System.out.println("My thirst level is "  + getThirstLevel());
        }else if (Integer.parseInt(inputNum) == 3) {
            System.out.println("My thirst level is "  + getBoredomLevel());
        }

  }

}
