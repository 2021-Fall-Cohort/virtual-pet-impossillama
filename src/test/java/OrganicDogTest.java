import org.junit.jupiter.api.Test;
import virtual_pet.OrganicCat;
import virtual_pet.OrganicDog;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

        @Test
        public void shouldReturnOrganicDogName() {
            OrganicDog newDog = new OrganicDog("Blinky", "Remember that ghost from Pac-Man?");
            String dogName = newDog.getName();
            assertEquals("Blinky", dogName);

        }
}
