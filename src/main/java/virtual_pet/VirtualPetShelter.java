package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

    private ArrayList <VirtualPet> petShelter;

    public VirtualPetShelter() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new VirtualPet("Beebo",50,50,50));
        petShelter.add(new VirtualPet("Revvo",50,50,50));

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

    public void adoptPet() {
        Scanner input =  new Scanner(System.in);
        String petToAdoptOut;
        petToAdoptOut = input.nextLine();
        for(VirtualPet animalForAdoption : petShelter) {
            if( petToAdoptOut == animalForAdoption.getName()) {
                removePet(animalForAdoption);
            }
        }

    }

}
