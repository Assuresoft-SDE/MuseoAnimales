package museum;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

class MuseumTest {

    private Museum museum = new Museum("Great Museum");

    @Mock
    List<Animal> animalCollection;

    @BeforeEach
    public void setUp(){
        Catfish catfish = mock(Catfish.class);
        Bat bat = mock(Bat.class);
        Whale whale = mock(Whale.class);
        Dolphin dolphin = mock(Dolphin.class);
        Deer deer = mock(Deer.class);
        Wolf wolf = mock(Wolf.class);
        Starfish starfish = mock(Starfish.class);

        MockitoAnnotations.openMocks(animalCollection);
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

        assertEquals(expectedResult, museum.searchAnimal(targetAnimal));
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