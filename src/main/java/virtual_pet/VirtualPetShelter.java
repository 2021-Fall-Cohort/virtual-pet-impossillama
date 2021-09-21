package virtual_pet;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelter {

    HashMap<String, VirtualPet> petShelter = new HashMap<String, VirtualPet>();

    public void addPet() {
        Scanner  input = new Scanner(System.in);
        String response;

        System.out.println("You want to add a new pet? Okay what is their name?");
        response = input.nextLine();

        petShelter.put(response, new VirtualPet(response, 50,50,50));



    }

    public void removePet() {

    }

}
