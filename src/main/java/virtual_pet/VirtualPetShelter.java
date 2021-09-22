package virtual_pet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {

    private Object VirtualPet;
    ArrayList<VirtualPet> petShelter = new ArrayList<VirtualPet>();


    public void addPet() {
        Scanner  input = new Scanner(System.in);
        String newPetName;
        int newPetThirst;
        int newPetHunger;
        int newPetBoredom;
        VirtualPet newPet;

        System.out.println("You want to add a new pet? Okay what is their name?");
        newPetName = input.nextLine();


        System.out.println("And what would you like their starting energy level to be?");
        newPetBoredom = input.nextInt();


        System.out.println("And what would you like their Thirst level to be?");
        newPetHunger = input.nextInt();


        System.out.println("And what would you like their hydration level to be?");
        newPetThirst= input.nextInt();


        newPet = new VirtualPet(newPetName, newPetHunger, newPetThirst, newPetBoredom);

        petShelter.add(newPet);
        

       System.out.println("Your new pet has been created!");
       System.out.println("Here are their stats: ");

        System.out.println("Name: " + newPet.getName());
        System.out.println("hunger: " + newPet.getHungerLevel());
        System.out.println("Thirst: " + newPet.getThirstLevel());
        System.out.println("Boredom level: " + newPet.getThirstLevel());





    }

    public void removePet() {

    }

    public void showPets() {


    }

}
