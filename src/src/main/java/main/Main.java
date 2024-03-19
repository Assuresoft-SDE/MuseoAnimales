package main;

import animals.*;
import enums.DigestionType;
import enums.RespirationType;

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
        catfish.breath();
        catfish.digest();

        Bat bat = new Bat(
                "Bati",
                "Chiroptera",
                ADMISSION_DATE,
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
                ADMISSION_DATE,
                "Cetacean",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        whale.breath();
        whale.digest();

        Dolphin dolphin = new Dolphin(
                "Doli",
                "Delphinidae",
                ADMISSION_DATE,
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
                ADMISSION_DATE,
                "Cervidae",
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY,
                1
        );
        deer.getAntlers();

        String scientificNameWolf = "Canidae";
        Wolf wolf = new Wolf(
                "Lobezno",
                scientificNameWolf,
                ADMISSION_DATE,
                scientificNameWolf,
                DigestionType.HERVIBORE,
                RespirationType.PULMONARY
        );

        Wolf wolfMate = new Wolf(
                "Lobezna",
                scientificNameWolf,
                ADMISSION_DATE,
                scientificNameWolf,
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
                ADMISSION_DATE,
                "Asteriidae",
                DigestionType.CARNIVORE,
                RespirationType.BRANCHIAL
        );
        starfish.breath();
        Starfish childStarfish = (Starfish) starfish.reproduce();
        childStarfish.breath();
    }
}
