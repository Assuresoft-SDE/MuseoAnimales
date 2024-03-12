import Animals.Bat;
import Animals.Catfish;
import Animals.Dolphin;
import Animals.Whale;
import enums.DigestionType;
import enums.RespirationType;

public class Main {
    public static void main(String [] args){
        Catfish catfish = new Catfish(
            "Nemo",
            "Siluriformes",
            "02/02/2022",
            "Ictaluridae"
        );
        catfish.digest(DigestionType.OMNIVORE);

        Bat bat = new Bat(
                "Bati",
                "Chiroptera",
                "03/02/2022",
                "Microchiroptera"
        );
        bat.breath(RespirationType.PULMONARY);
        bat.digest(DigestionType.OMNIVORE);
        bat.emitSound(15);

        Whale whale = new Whale(
                "Dora",
                "Cetacea",
                "02/02/2022",
                "Cetacean"
        );
        whale.breath(RespirationType.BRANCHIAL);
        whale.digest(DigestionType.CARNIVORE);

        Dolphin dolphin = new Dolphin(
                "Deli",
                "Delphinidae",
                "02/02/2022",
                "Delphinidae"
        );
        dolphin.breath(RespirationType.BRANCHIAL);
        dolphin.digest(DigestionType.CARNIVORE);
        dolphin.emitSound(50);
    }
}
