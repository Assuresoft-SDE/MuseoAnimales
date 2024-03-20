package animals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalInformationTest {
    private AnimalInformation animal;

    @BeforeEach
    public void setup() {
        this.animal = new AnimalInformation(
                "Lion",
                "Panthera leo",
                "2023-05-10",
                "Felidae"
        );
    }

    @Test
    void testGetName() {
        assertEquals("Lion", animal.getName());
    }

    @Test
    void testGetScientificName() {
        assertEquals("Panthera leo", animal.getScientificName());
    }

    @Test
    void testGetAdmissionDate() {
        assertEquals("2023-05-10", animal.getAdmissionDate());
    }

    @Test
    void testGetFamily() {
        assertEquals("Felidae", animal.getFamily());
    }
}
