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

  } public void petInteraction(){
     // Interactions for this class will include:
     // - feed
     // - give water
     // - play
     // - check time? (for .tick() method)
        //- stop
        // Should have set variables and check for them, the same as the gettingStarted() method (might rename it to menu or something)
     // thinking about doing ths as a while loop so we it can run until the user types in stop

        Scanner interaction =  new Scanner(System.in);
        String interactionReply ;

        String feed = "feed";
        String giveWater = " give water";
        String playWith =" play";
        String checkTime = "check time ";
        boolean stop = false ;

        System.out.println("What would you like to do next?");

    }


}
