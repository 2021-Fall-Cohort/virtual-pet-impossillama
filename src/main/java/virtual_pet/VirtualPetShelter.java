package virtual_pet;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {

    private Object VirtualPet;
    ArrayList<VirtualPet> petShelter;

    public void petList() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new VirtualPet("Beebo",50,50,50));
        petShelter.add(new VirtualPet("Revvo",50,50,50));
    }

    public void addNewPet() {
        petList();

        Scanner  input = new Scanner(System.in);
        String newPetName;

        VirtualPet newPet = new VirtualPet("",0,0,0);

        System.out.println("You want to add a new pet? Okay what is their name?");
        newPetName = input.nextLine();
        newPet.setName(newPetName);
        newPet.setHungerLevel((int)Math.floor(Math.random() * 100));
        newPet.setThirstLevel((int)Math.floor(Math.random() * 100));
        newPet.setBoredomLevel((int)Math.floor(Math.random() * 100));

        newPet = new VirtualPet(newPetName, newPet.getHungerLevel(), newPet.getThirstLevel(), newPet.getBoredomLevel());

        petShelter.add(newPet);


       System.out.println("Your new pet has been created!");

       listPets();

    }

    public void listPets() {
        System.out.println("List of pets: ");
        for (VirtualPet pet : petShelter){
            System.out.println("Name:" + pet.getName());
            System.out.println("Hunger Level: " + pet.getHungerLevel());
            System.out.println("Thirst Level: " + pet.getThirstLevel());
            System.out.println("Boredom Level: " + pet.getBoredomLevel() + "\n");

        }

    }

    public void adoptPet() {
        petList();

        Scanner input = new Scanner(System.in);
        String adoptedPet;

        adoptedPet = input.nextLine();

        System.out.println("Which pet would you like to remove?");
        for(VirtualPet pet : petShelter ) {
            if (pet.getName() == adoptedPet) {
                petShelter.remove(pet);
            }

            listPets();
        }
    }



}
