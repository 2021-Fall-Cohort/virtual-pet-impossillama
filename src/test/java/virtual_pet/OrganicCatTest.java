package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {

    @Test
    public  void shouldReturnOrganicCatName(){
        OrganicCat newCat = new OrganicCat("Winky", "He smells like fish");
        String catName = newCat.getName();
        assertEquals("Winky", catName);
    }


}
