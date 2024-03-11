import Animals.*;
import Enums.DigestionType;
import Enums.RespirationType;

public class Main {
    public static void main(String [] args){
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
    }
}
