package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;


public class VirtualPetApplication {

    VirtualPetShelter myShelter = new VirtualPetShelter();




    public static void main(String[] args) {
        VirtualPetApplication game = new VirtualPetApplication();
        game.gameLoop();
    }

    public void gameLoop() {
        listPets(myShelter);
        Boolean quit = false;

        System.out.println("Welcome to the pet shelter! Here you can feed your pets, " +
                "adopt them out or add new pets to the list");
        System.out.println("here is the status of all of your pets: \n");
        listPets(myShelter);

        System.out.println("If you want to feed the pets please press 1 \n" +
                "If you want water pets press 2 \n" +
                "If you want to play with a pet press 3 \n" +
                "If you want to adopt a  pet press 4 \n" +
                "If you want to admit a pet press 5\n" +
                "If you want to list their stats press 6\n " +
                "If you want to view the menu, press 7 \n" +
                "To close out the program, just enter quit");

        do {
            Scanner input = new Scanner(System.in);
            int menuChoice;

            menuChoice = input.nextInt();

            myShelter.tickAllPets();

            switch(menuChoice){
                case 1:
                    myShelter.feedAllPets();
                    System.out.println("All pets are fed!");
                    break;
                case 2:
                    myShelter.waterAllPets();
                    System.out.println("All pets are watered!");
                    break;
                case 3:
                    System.out.println("Which pet would you like to play with?");
                    myShelter.playWithPet();
                    System.out.println("That was fun!");
                    break;
                case 4:
                    System.out.println("Which pet would you like to take home with you?");
                    myShelter.listPetDescriptions();
                    myShelter.adoptPet();
                    System.out.println("What a great choice!");
                    listPets(myShelter);
                    break;
                case 5:
                    myShelter.addNewPet(createPet());
                    System.out.println("New Pet Created!");
                    break;
                case 6:
                    System.out.println("Here's all the pets currently in your shelter: ");
                    listPets(myShelter);
                    break;
                default:
                    System.out.println("Oops you broke it");
                    break;

             }


        }while(!quit);

    }
    public VirtualPet createPet(){
        Scanner input = new Scanner(System.in);
        String newPetName;
        String newPetDescription;

        VirtualPet newPet = new VirtualPet("","",0,0,0);

        System.out.println("You want to add a new pet? Okay what is their name?");
        newPetName = input.nextLine();

        System.out.println("Describe the pet");
        newPetDescription = input.nextLine();

        newPet.setName(newPetName);
        newPet.setDescription(newPetDescription);
        newPet.setHungerLevel((int)Math.floor(Math.random() * 100));
        newPet.setThirstLevel((int)Math.floor(Math.random() * 100));
        newPet.setBoredomLevel((int)Math.floor(Math.random() * 100));

        newPet = new VirtualPet(newPetName, newPetDescription,  newPet.getHungerLevel(), newPet.getThirstLevel(), newPet.getBoredomLevel());




        System.out.println("Your new pet has been created!");

        return newPet;

    }



    public void listPets(VirtualPetShelter petShelter){
        System.out.println("List of pets: ");
        for (VirtualPet pet : petShelter.getPets()){
            System.out.println("Name:" + pet.getName());
            System.out.println("Description: " + pet.getDescription());
            System.out.println("Hunger Level: " + pet.getHungerLevel());
            System.out.println("Thirst Level: " + pet.getThirstLevel());
            System.out.println("Boredom Level: " + pet.getBoredomLevel() + "\n");

        }
    }

}
