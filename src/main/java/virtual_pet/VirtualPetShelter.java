package virtual_pet;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class VirtualPetShelter {

    private ArrayList <VirtualPet> petShelter;

    public VirtualPetShelter() {
        petShelter = new ArrayList<VirtualPet>();
        petShelter.add(new OrganicCat("Beebo","Is covered in fleas"));
        petShelter.add(new OrganicDog("Revvo","Needs a rabies shot"));
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

    public void feedAllOrganicPets() {
        for (VirtualPet petsToFeed : petShelter) {
            if (petsToFeed instanceof OrganicPet) {
                ((OrganicPet) petsToFeed).feed();
            }


        }
    }

    public void tickAllPets(){
        for(VirtualPet petsToTick : petShelter) {
            petsToTick.tick();
        }
    }

    public void waterAllOrganicPets() {
        for(VirtualPet petsToWater : petShelter) {
            if (petsToWater instanceof OrganicPet) {
                ((OrganicPet) petsToWater).water();
            }

        }
    }

    public void oilRoboticPets() {
        for(VirtualPet roboticPets : petShelter) {
            if(roboticPets instanceof RoboticPet) {
                ((RoboticPet) roboticPets).refillOil();
            }
        }
    }

    public void chargeRoboticPets() {
        for(VirtualPet robotPets : petShelter) {
            if(robotPets instanceof RoboticPet) {
                ((RoboticPet) robotPets).charge();
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
