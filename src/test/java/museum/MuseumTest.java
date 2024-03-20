package museum;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MuseumTest {

    private Museum museum = new Museum("Great Museum");

    @BeforeEach
    public void setUp(){
        final String ADMISSION_DATE = "02/02/2022";
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
        List<Animal> animalCollection = new ArrayList<>();
        animalCollection = new ArrayList<>();
        animalCollection.add(starfish);
        animalCollection.add(wolf);
        animalCollection.add(deer);
        animalCollection.add(dolphin);
        animalCollection.add(whale);
        animalCollection.add(bat);
        animalCollection.add(catfish);
        this.museum.addAnimalCollection(animalCollection);
    }

    @Test
    public void testSearchAnimalPedro() {
        String targetAnimal = "Pedro";
        String expectedResult = "Pedro is in the museum.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalDoli() {
        String targetAnimal = "Doli";
        String expectedResult = "Doli is in the museum.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalLobezno() {
        String targetAnimal = "Lobezno";
        String expectedResult = "Lobezno is in the museum.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalArdilla() {
        String targetAnimal = "Ardilla";
        String expectedResult = "Animal not found.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalDolores() {
        String targetAnimal = "Dolores";
        String expectedResult = "Animal not found.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalZack() {
        String targetAnimal = "Zack";
        String expectedResult = "Animal not found.";
        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }
}