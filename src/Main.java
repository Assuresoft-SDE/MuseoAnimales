import Animals.*;
import Enums.DigestionType;
import Enums.RespirationType;
import Museum.Museum;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Catfish catfish = new Catfish(
                "Pedro",
                "Siluriforme",
                "02/02/2022",
                "Ictaluridae",
                DigestionType.OMNIVORE,
                RespirationType.TRACHEAS

        );
        catfish.breath();
        catfish.digest();

        Bat bat = new Bat(
                "Bati",
                "Chiroptera",
                "03/02/2022",
                "Microchiroptera",
                DigestionType.OMNIVORE,
                RespirationType.PULMONARY
        );
        bat.breath();
        bat.digest();
        bat.emitFrequency(15);

        Whale whale = new Whale(
                "Doris",
                "Cetacea",
                "02/02/2022",
                "Cetacean",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        whale.breath();
        whale.digest();

        Dolphin dolphin = new Dolphin(
                "Doli",
                "Delphinidae",
                "02/02/2022",
                "Delphinidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        dolphin.breath();
        dolphin.digest();
        dolphin.emitFrequency(50);

        Deer deer = new Deer(
                "Bambi",
                "Cervidae",
                "01/01/2022",
                "Cervidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY,
                1
        );
        deer.getAntlers();

        Wolf wolf = new Wolf(
                "Lobezno",
                "Canidae",
                "01/01/2022",
                "Canidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY
        );

        Wolf wolfMate = new Wolf(
                "Lobezna",
                "Canidae",
                "01/01/2022",
                "Canidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY
        );
        wolf.breath();
        wolfMate.breath();
        Wolf pup = (Wolf) wolf.reproduce(wolfMate);
        pup.breath();

        Starfish starfish = new Starfish(
                "Doli",
                "Asterias",
                "02/02/2022",
                "Asteriidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        starfish.breath();
        Starfish childStarfish = (Starfish) starfish.reproduce();
        childStarfish.breath();

        List<Animal> animalsList = new ArrayList<>() {{
            add(catfish);
            add(bat);
            add(whale);
            add(dolphin);
            add(deer);
            add(wolf);
            add(wolfMate);
            add(starfish);
        }};

        Museum museum = new Museum("Fantastic exhibitions ");
        museum.setAnimalCollection(animalsList);
        String wantedAnimal = museum.searchAnimal("Doli");
        System.out.println(wantedAnimal);
    }
}
