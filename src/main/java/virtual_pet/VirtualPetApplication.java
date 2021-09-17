package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetApplication {

    VirtualPet llama;


    public static void main(String[] args) {
        VirtualPetApplication game = new VirtualPetApplication();
        game.llama = new VirtualPet("Llama Charlie", 50,50,50);
        System.out.println("Welcome to the Virtual Pet Farm! I'm" + game.llama.getName());
        game.gettingStarted();
    }

    public void gettingStarted() {

        System.out.println("You can feed me, give me water, and check my boredom level! But beware! If I get bored, I spit! ");
        System.out.println("My stats are currently:");
        System.out.println("Hunger Level: " + llama.getHungerLevel());
        System.out.println("Thirst Level: " + llama.getThirstLevel());
        System.out.println("Boredom Level: " + llama.getBoredomLevel());
        petInteraction();
    }

    public void petInteraction(){
        Scanner interaction =  new Scanner(System.in);
        String interactionReply;
        boolean stop = false ;

        ArrayList<String> llamaStats = new ArrayList<String>();
        llamaStats.add("Hunger Level: " + llama.getHungerLevel());
        llamaStats.add("Thirst Level: " + llama.getThirstLevel());
        llamaStats.add("Boredom Level: "+ llama.getBoredomLevel());

        do {
            System.out.println("You can check my stats, feed me, give me water, and we can play!" +
                    " But make sure I'm not about to spit by checking my boredom level");
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

            } else if(interactionReply.equalsIgnoreCase("stats") || interactionReply.equalsIgnoreCase("get stats")) {
                System.out.println("My stats are currently: " + llamaStats);
            } else {
                System.out.println(" ");
            }
        } while (!stop);
    }

    public void tick() {


    }


}
