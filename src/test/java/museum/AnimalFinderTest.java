package museum;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AnimalFinderTest {
    private AnimalFinder animalFinder;
    private List<Animal> animalCollection;

    @BeforeEach
    public void setUp() {
        final String ADMISSION_DATE = "02/02/2022";
        animalFinder = new AnimalFinder();
        Catfish catfish = new Catfish(
                "Pedro",
                "Siluriforme",
                ADMISSION_DATE,
                "Ictaluridae",
                DigestionType.OMNIVORE,
                RespirationType.TRACHEAS
        );
        Bat bat = new Bat(
                "Bati",
                "Chiroptera",
                ADMISSION_DATE,
                "Microchiroptera",
                DigestionType.OMNIVORE,
                RespirationType.PULMONARY
        );
        Whale whale = new Whale(
                "Doris",
                "Cetacea",
                ADMISSION_DATE,
                "Cetacean",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        Dolphin dolphin = new Dolphin(
                "Doli",
                "Delphinidae",
                ADMISSION_DATE,
                "Delphinidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        Deer deer = new Deer(
                "Bambi",
                "Cervidae",
                ADMISSION_DATE,
                "Cervidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY,
                1
        );
        String scientificNameWolf = "Canidae";
        Wolf wolf = new Wolf(
                "Lobezno",
                scientificNameWolf,
                ADMISSION_DATE,
                scientificNameWolf,
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY
        );
        Starfish starfish = new Starfish(
                "Dola",
                "Delphinidae",
                "02/02/2022",
                "Asteriidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        this.animalCollection = new ArrayList<>();
        this.animalCollection.add(starfish);
        this.animalCollection.add(wolf);
        this.animalCollection.add(deer);
        this.animalCollection.add(dolphin);
        this.animalCollection.add(whale);
        this.animalCollection.add(bat);
        this.animalCollection.add(catfish);
    }

    @Test
    public void testAnimalFinderNotNull() {
        assertNotNull(animalFinder);
    }

    @Test
    public void testJumpSearchFirstElementInCollectionJumpOf5() {
        int expectedIndex = 0;
        int jumpSize = 5;
        String targetAnimal = "Bambi";
        assertEquals(
                expectedIndex,
                animalFinder.jumpSearchAlgorithm(
                        targetAnimal,
                        jumpSize,
                        animalCollection
                )
        );
    }

    @Test
    public void testJumpSearchLastElementInCollectionJumpOf5() {
        int expectedIndex = 6;
        int jumpSize = 5;
        String targetAnimal = "Pedro";
        assertEquals(
                expectedIndex,
                animalFinder.jumpSearchAlgorithm(
                        targetAnimal,
                        jumpSize,
                        animalCollection
                )
        );
    }

    @Test
    public void testJumpSearchElementNotInCollection() {
        int expectedIndex = -1;
        int jumpSize = 5;
        String targetAnimal = "Zack";
        assertEquals(
                expectedIndex,
                animalFinder.jumpSearchAlgorithm(
                        targetAnimal,
                        jumpSize,
                        animalCollection
                )
        );
    }
}