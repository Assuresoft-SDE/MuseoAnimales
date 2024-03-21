package museum;

import animals.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class MuseumTest {

    private final Museum museum = new Museum("Great Museum");
    List<Animal> animalCollection;
    AnimalInformation animalInformation;

    @BeforeEach
    public void setUp(){
        this.animalInformation = mock(AnimalInformation.class);
        Catfish catfish = mock(Catfish.class);
        Bat bat = mock(Bat.class);
        Whale whale = mock(Whale.class);
        Dolphin dolphin = mock(Dolphin.class);
        Deer deer = mock(Deer.class);
        Wolf wolf = mock(Wolf.class);
        Starfish starfish = mock(Starfish.class);

        animalCollection = new ArrayList<>();

        animalCollection.add(catfish);
        animalCollection.add(bat);
        animalCollection.add(whale);
        animalCollection.add(dolphin);
        animalCollection.add(deer);
        animalCollection.add(wolf);
        animalCollection.add(starfish);

        this.museum.addAnimalCollection(animalCollection);

        for(int i = 0; i < animalCollection.size(); i ++){
            when(animalCollection.get(i).getInformation()).thenReturn(animalInformation);
        }
    }

    @Test
    public void testSearchAnimalDoli() {
        String targetAnimal = "Doli";
        String expectedResult = "Doli is in the museum.";

        when(this.animalInformation.getName()).thenReturn(targetAnimal);

        assertEquals(
                expectedResult,
                museum.searchAnimal(targetAnimal)
        );
    }

    @Test
    public void testSearchAnimalPedro() {
        String targetAnimal = "Pedro";
        String expectedResult = "Pedro is in the museum.";

        when(animalInformation.getName()).thenReturn(targetAnimal);

        assertEquals(
                expectedResult,
                museum.searchAnimal(targetAnimal)
        );
    }
    @Test
    public void testSearchAnimalLobezno() {
        String targetAnimal = "Lobezno";
        String expectedResult = "Lobezno is in the museum.";

        when(this.animalInformation.getName()).thenReturn(targetAnimal);

        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalDolores() {
        String targetAnimal = "Dolores";
        String expectedResult = "Animal not found.";

        when(this.animalInformation.getName()).thenReturn(targetAnimal);

        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    @Test
    public void testSearchAnimalZack() {
        String targetAnimal = "Zack";
        String expectedResult = "Animal not found.";

        when(this.animalInformation.getName()).thenReturn(targetAnimal);

        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }

    /*
    @Test
    public void testSearchAnimalArdilla() {
        String targetAnimal = "Ardilla";
        String expectedResult = "Animal not found.";

        assertEquals(expectedResult,museum.searchAnimal(targetAnimal));
    }
*/
}
