package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    VirtualPet llama;


    public static void main(String[] args) {
        VirtualPetApplication game = new VirtualPetApplication();
        game.llama = new VirtualPet("Llama Charlie", 50,50,50);
        System.out.println("Welcome to the Virtual Pet Farm! I'm" + game.llama.getName());
        System.out.println("You can feed me, give me water, and check my boredom level! But beware! If I get bored, I spit! ");
        game.gettingStarted();
    }

    public void gettingStarted() {
        Scanner input =  new Scanner(System.in);
        String inputString;

        System.out.println("My stats are currently: ");
        System.out.println("You can also type menu for a list of options");
        inputString = input.nextLine();

        ArrayList<String> menu = new ArrayList<String>();
        menu.add("check stats");
        menu.add("interact");

        ArrayList<String> llamaStats = new ArrayList<String>();
        llamaStats.add("Hunger Level: " + llama.getHungerLevel());
        llamaStats.add("Thirst Level: " + llama.getThirstLevel());
        llamaStats.add("Boredom Level: "+ llama.getBoredomLevel());

        if (inputString.equalsIgnoreCase("stats" ) || inputString.equalsIgnoreCase("check stats")) {
            System.out.println("My stats are currently: \n" + llamaStats );
        } else if(inputString.equalsIgnoreCase("interact")) {
            petInteraction();
        } else if(inputString.equalsIgnoreCase("menu")) {
            System.out.println("Please choose from the following options: \n" + menu);
            String menuOptions = "";
             switch (menuOptions) {
                 case "check stats":
                     System.out.println("My stats are: \n" + llamaStats);
                     break;
                 case "interaction":
                     petInteraction();

                 default:
                     gettingStarted();
                     break;
             }
        } else{
            System.out.println("It looks like you're having some trouble with figuring out what to do! it's okay");
            gettingStarted();
        }

    }

    public void petInteraction(){
        // Interactions for this class will include:
        // - feed
        // - give water
        // - play
        // - check time? (for .tick() method)
        //- stop
        // Should have set variables and check for them, the same as the gettingStarted() method (might rename it to menu or something)
        // thinking about doing ths as a while loop so we it can run until the user types in stop

        Scanner interaction =  new Scanner(System.in);
        String interactionReply;


        boolean stop = false ;



        do {
            System.out.println("What would you like to do next?");
            System.out.println("You can check my stats, feed me, give me water, play with me, or make sure I'm not about to spit by");
            interactionReply = interaction.nextLine();

            if (interactionReply.equalsIgnoreCase("feed") ||interactionReply.equalsIgnoreCase("give food") ){
                llama.feed(llama.getHungerLevel() + 10);
                System.out.print("Thanks I was hungry!");
            } else if(interactionReply.equalsIgnoreCase("water") || interactionReply.equalsIgnoreCase("give water")) {
                llama.water(llama.getThirstLevel() - 10);
                System.out.println("Thanks! I was getting really thirsty!");
            } else if( interactionReply.equalsIgnoreCase("play")|| interactionReply.equalsIgnoreCase("let's play")) {
                llama.play(llama.getBoredomLevel() - 10);
                System.out.print("Thanks! that was fun!");

            }
        } while (!stop);
    }

    public void boredomMeter() {

    }


}
