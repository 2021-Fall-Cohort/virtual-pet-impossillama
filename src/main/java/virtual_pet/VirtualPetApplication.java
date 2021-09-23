package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;


public class VirtualPetApplication {


    VirtualPetShelter myShelter = new VirtualPetShelter();


    public static void main(String[] args) {
        VirtualPetApplication game = new VirtualPetApplication();
        VirtualPetShelter myShelter = game.myShelter;
        myShelter.addNewPet();
    }


//    public void petShelterInteraction() {
//        System.out.println("You can feed me, give me water, and check my boredom level! But beware! If I get bored, I spit! ");
//
//
//    }

//    public void petInteraction(){
//        Scanner interaction =  new Scanner(System.in);
//        String interactionReply;
//        boolean stop = false ;
//        boolean alive = true;
//
//
//
//        do {
//            System.out.println("You can check my stats, feed me, give me water, and we can play!" +
//                    " But make sure I'm not about to spit by checking my boredom level");
//            interactionReply = interaction.nextLine();
//
//            if (interactionReply.equalsIgnoreCase("feed") ||interactionReply.equalsIgnoreCase("give food") ){
//                if (llama.getHungerLevel() >= 100) {
//                    System.out.println("If I eat one more thing, I'll get sick!");
//                }
//                System.out.print("Thanks I was hungry!");
//                llama.feed();
//            } else if(interactionReply.equalsIgnoreCase("water") || interactionReply.equalsIgnoreCase("give water")) {
//                llama.water();
//                System.out.println("Thanks! I was getting really thirsty!");
//            } else if( interactionReply.equalsIgnoreCase("play")|| interactionReply.equalsIgnoreCase("let's play")) {
//                llama.play();
//                System.out.print("Thanks! that was fun!");
//
//            } else if(interactionReply.equalsIgnoreCase("stats") || interactionReply.equalsIgnoreCase("get stats")) {
//                System.out.println("You currently have " + myShelter.petShelter.size() + " pets");
//            }
//        } while (!stop || !alive);
//    }



}
