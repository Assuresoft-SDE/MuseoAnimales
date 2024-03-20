package main;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;
import museum.Museum;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String ADMISSION_DATE = "02/02/2022";

    public static void main(String[] args) {
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
        animalCollection.add(starfish);
        animalCollection.add(wolf);
        animalCollection.add(deer);
        animalCollection.add(dolphin);
        animalCollection.add(whale);
        animalCollection.add(bat);
        animalCollection.add(catfish);

        Museum museum = new Museum("Great Museum");
        museum.addAnimalCollection(animalCollection);
        String wantedPedro = museum.searchAnimal("Pedro");
        String wantedBambi = museum.searchAnimal("Bambi");
        String wantedDoli = museum.searchAnimal("Doli");
        String wantedDoris = museum.searchAnimal("Doris");
        String wantedLobezno = museum.searchAnimal("Lobezno");
        String wantedBati = museum.searchAnimal("Bati");
        String wantedLion = museum.searchAnimal("Lion");

        System.out.println(wantedPedro);
        System.out.println(wantedBambi);
        System.out.println(wantedDoli);
        System.out.println(wantedDoris);
        System.out.println(wantedLobezno);
        System.out.println(wantedBati);
        System.out.println(wantedLion);
    }
}
