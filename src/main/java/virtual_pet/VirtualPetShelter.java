package virtual_pet;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

    private ArrayList <VirtualPet> petShelter;

    public VirtualPetShelter() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new VirtualPet("Beebo","Is covered in fleas"));
        petShelter.add(new VirtualPet("Revvo","Needs a rabies shot"));
        petShelter.add(new DogRobo("Frisket", "The best dog in Mainframe"));
        petShelter.add(new CatRobo("Widget","ROADHOUSE"));

    }


    public void addNewPet(VirtualPet pet) {

        petShelter.add(pet);
    }

    public void removePet(VirtualPet pet) {

        petShelter.remove(pet);
    }


    public ArrayList<VirtualPet> getPets() {

        return petShelter;
    }

    public void feedAllPets() {
        for (VirtualPet petsToFeed : petShelter) {
            petsToFeed.feed();


        }
    }

    public void tickAllPets(){
        for(VirtualPet petsToTick : petShelter) {
            petsToTick.tick();
        }
    }

    public void waterAllPets() {
        for(VirtualPet petsToWater : petShelter) {
            petsToWater.water();

        }
    }

    public void playWithPet() {
        Scanner input = new Scanner(System.in);
        String pet;
        pet = input.nextLine();
        for (VirtualPet  petToPlayWith : petShelter){
            if (pet == petToPlayWith.getName()) {
                petToPlayWith.play();

            }

        }

    }

    public void listPetDescriptions() {
        for(VirtualPet petsForAdoption : petShelter) {
            System.out.println(petsForAdoption.getName() + " " + petsForAdoption.getDescription());
            tickAllPets();
        }
    }

    public void adoptPet() {
        Scanner input =  new Scanner(System.in);
        String petToAdoptOut;
        petToAdoptOut = input.nextLine();
        for(VirtualPet adoptablePet : petShelter) {
            adoptablePet.equals(petToAdoptOut);
            removePet(adoptablePet);
            tickAllPets();
        }

    }
    public boolean deadPetSearch(){
        for(VirtualPet deadPet : petShelter){
            if(deadPet.isDead()) {
                return true;
            }
        }
            return false;
    }

}
