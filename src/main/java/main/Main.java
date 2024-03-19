package main;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;
import museum.Museum;
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

        Bat bat = new Bat(
                "Bati",
                "Chiroptera",
                "03/02/2022",
                "Microchiroptera",
                DigestionType.OMNIVORE,
                RespirationType.PULMONARY
        );

        Whale whale = new Whale(
                "Doris",
                "Cetacea",
                "02/02/2022",
                "Cetacean",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );

        Dolphin dolphin = new Dolphin(
                "Doli",
                "Delphinidae",
                "02/02/2022",
                "Delphinidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );

        Deer deer = new Deer(
                "Bambi",
                "Cervidae",
                "01/01/2022",
                "Cervidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY,
                1
        );

        Wolf wolf = new Wolf(
                "Lobezno",
                "Canidae",
                "01/01/2022",
                "Canidae",
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
