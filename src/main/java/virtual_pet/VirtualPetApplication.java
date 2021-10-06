package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;


public class VirtualPetApplication {
    VirtualPetShelter myShelter;




    public static void main(String[] args) {
        VirtualPetApplication game = new VirtualPetApplication();

        game.gameLoop();
    }

    public void gameLoop() {
        myShelter = new VirtualPetShelter();
        Boolean quit = false;

        System.out.println("Welcome to the pet shelter! Here you can feed your pets, " +
                "adopt them out or add new pets to the list");
        System.out.println("Here is the status of all of your pets: \n");
        listPets(myShelter);


        do {


            System.out.println("Press 1 to feed all organic pets \n" +
                    "Press 2 to water all organic pets \n" +
                    "Press 3 to oil all robotic pets\n" +
                    "Press 4 to charge all robotic pets\n" +
                    "Press 5 to adopt a pet out\n" +
                    "Press 6 to admit a pet\n" +
                    "Press 7  to list all pets\n" +
                    "Press 8 to play with a pet" +
                    "Press 9 to quit the program");

            Scanner input = new Scanner(System.in);
            int menuChoice;

            menuChoice = input.nextInt();

            myShelter.tickAllPets();

            healthCheck(myShelter);
            boredomCheck(myShelter);
            if (myShelter.deadPetSearch()) {
                System.out.println("One of your pets has died");
                break;
            }



            switch(menuChoice){
                case 1:
                    myShelter.feedAllPets();
                    System.out.println("All organic pets are fed!");
                    break;
                case 2:
                    myShelter.waterAllPets();
                    System.out.println("All organic pets are watered!");
                    break;
                case 3:
                    System.out.println("All robot pets are oiled");
                    myShelter.oilRoboticPets();
                    break;
                case 4:
                    System.out.println("All robot pets have been recharged");
                    myShelter.chargeRoboticPets();
                    break;
                    case 5:
                    System.out.println("Which pet would you like to take home with you?");
                    myShelter.listPetDescriptions();
                    myShelter.adoptPet();
                    System.out.println("What a great choice!");
                    listPets(myShelter);
                    break;
                    case 6:
                    myShelter.addNewPet(createPet());
                    System.out.println("New Pet Created!");
                    break;
                case 7:
                    System.out.println("Here's all the pets currently in your shelter: ");
                    listPets(myShelter);
                    break;
                case 8:
                    System.out.println("Which pet would you like to play with?");
                    playWithPets(myShelter);
                    break;
                default:
                    System.out.println("Oops you broke it");
                    break;

             }


        }while(!quit);
        System.out.println("Game Over");
    }
    public VirtualPet createPet(){
        Scanner input = new Scanner(System.in);
        String newPetName;
        String newPetDescription;
        String petDesignation;



        System.out.println("You want to add a new pet? Would you like to add an organic or robotic pet?");
        petDesignation = input.nextLine();

        if (petDesignation.equals("organic")) {
            OrganicPet newPet = new OrganicPet("", "");

            System.out.println("Describe the pet");
            newPetDescription = input.nextLine();

            System.out.println("What is the pet's name?");
            newPetName = input.nextLine();

            newPet.setName(newPetName);
            newPet.setDescription(newPetDescription);

            newPet = new OrganicPet(newPetName, newPetDescription);
            return newPet;


        } else if(input.equals("robotic")){
            RoboticPet newPet = new RoboticPet("", "");

            System.out.println("Describe the pet");
            newPetDescription = input.nextLine();

            System.out.println("What is the pet's name?");
            newPetName = input.nextLine();

            newPet.setName(newPetName);
            newPet.setDescription(newPetDescription);

            newPet = new RoboticPet(newPetName, newPetDescription);
            return newPet;
        }


        System.out.println("Your new pet has been created!");

        return null;
    }



    public void listPets(VirtualPetShelter petShelter){
        System.out.println("List of pets: ");
        for (VirtualPet pet : petShelter.getPets()){
            if ( pet instanceof  OrganicPet) {
                System.out.println("Name:" + pet.getName());
                System.out.println("Description: " + pet.getDescription());
                System.out.println("Hunger Level: " + ((OrganicPet) pet).getHungerLevel());
                System.out.println("Thirst Level: " +  ((OrganicPet) pet).getHungerLevel());
                System.out.println("Boredom Level: " +  (pet.getBoredomLevel()));
                System.out.println("Cage Soil Level: " + ((OrganicPet) pet).getSanitationLevel() + "\n");
            } else if (pet instanceof RoboticPet) {
                System.out.println("Name:" + pet.getName());
                System.out.println("Description: " + pet.getDescription());
                System.out.println("Oil Level: " + ((RoboticPet) pet).getOilLevel());
                System.out.println("Battery Level: " +  ((RoboticPet) pet).getBatteryCharge());
                System.out.println("Boredom Level: " +  pet.getBoredomLevel()+ "\n");

            }
        }
    }

    public void healthCheck(VirtualPetShelter petDied){
        petDied.deadPetSearch();
    }

    public void boredomCheck(VirtualPetShelter petDied){
        for(VirtualPet boredPet : myShelter.getPets()) {
            if (boredPet instanceof DogRobo || boredPet instanceof OrganicDog){
                System.out.println(boredPet.getName() +" is about to lose their mind with boredom, you might" +
                        "want to walk them");
            } else if(boredPet instanceof RoboticPet || boredPet instanceof  OrganicPet) {
                System.out.println(boredPet.getName() +" is about to lose their mind with boredom, you might" +
                        "want to play with them");
            }

        }

    }

    public void playWithPets(VirtualPetShelter petsToPlayWith) {
        Scanner input = new Scanner(System.in);
        String petName;
        petName = input.nextLine();

        for (VirtualPet availablePets : myShelter.getPets()) {
            if(availablePets instanceof OrganicPet){
                if(petName.equals(availablePets.getName())){
                    availablePets.play();
                } else if(availablePets instanceof RoboticPet) {
                    if (petName.equals(availablePets.getName())) {
                        availablePets.play();
                    }
                }

            }
        }
    }
}
