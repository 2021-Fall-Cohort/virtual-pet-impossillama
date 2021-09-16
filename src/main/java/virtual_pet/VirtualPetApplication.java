package virtual_pet;

public class VirtualPetApplication {

    static VirtualPet llama = new VirtualPet("Llama Charlie", 50,50,50);

    public static void main(String[] args) {
        System.out.println("Welcome to the Virtual Pet Farm! I'm " + llama.getName() + " !");
        System.out.println("You can feed me, give me water, and check my boredom level! But beware! If I get bored, I spit! ");
        llama.gettingStarted();
        llama.petInteraction();
    }

}
