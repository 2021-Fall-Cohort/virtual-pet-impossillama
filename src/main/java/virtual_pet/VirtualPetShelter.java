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

        }
    }

    public void adoptPet(String petName) {
        VirtualPet petToAdopt = getPetByName(petName);
        if(petShelter.contains(petToAdopt)){
            petShelter.remove(petToAdopt);
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

    public void cleanCage(VirtualPet pet) {
        if(pet instanceof OrganicPet) {
            ((OrganicPet) pet).sanitationLevel -= 10;
        }

    }

    public void cleanAllCages() {
        for(VirtualPet pet : petShelter) {
            if(pet instanceof OrganicPet) {
                cleanCage(pet);
            }
        }
    }

    public VirtualPet getPetByName(String petName) {
        int petIndex = -1;
        for(VirtualPet pet : petShelter ) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                petIndex = petShelter.indexOf(pet);
            }
        }
        if(petIndex > -1) {
            return petShelter.get(petIndex);
        } else {
            return null;
        }
    }


}
