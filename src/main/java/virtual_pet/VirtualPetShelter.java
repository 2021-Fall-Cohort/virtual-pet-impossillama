package virtual_pet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {

    private Object VirtualPet;
    ArrayList<VirtualPet> petShelter = new ArrayList<VirtualPet>();


    public void addNewPet() {
        Scanner  input = new Scanner(System.in);
        String newPetName;
        int min = 10;
        int max = 50;
        VirtualPet newPet = new VirtualPet("",0,0,0);

        System.out.println("You want to add a new pet? Okay what is their name?");
        newPetName = input.nextLine();
        newPet.setName(newPetName);
        newPet.setHungerLevel((int)Math.floor(Math.random() * (max-min+1) + 1));
        newPet.setThirstLevel((int)Math.floor(Math.random() * (max-min+1) + 1));
        newPet.setBoredomLevel((int)Math.floor(Math.random() * (max-min+1) + 1));

        newPet = new VirtualPet(newPetName, newPet.getHungerLevel(), newPet.getThirstLevel(), newPet.getBoredomLevel());

        petShelter.add(newPet);


       System.out.println("Your new pet has been created!");
       System.out.println("Here are their stats: ");
       System.out.println("Name: " + newPet.getName());
       System.out.println("Hunger Level: " + newPet.getHungerLevel());
       System.out.println("Thirst Level: " + newPet.getThirstLevel());
       System.out.println("Boredom Level: " + newPet.getThirstLevel());





    }

    public void removePet() {

    }

    public void showPets() {


    }

}
