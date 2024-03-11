package Animals;

import Interfaces.IEcholocationSystem;
import enums.DigestionType;

public class Dolphin extends Animal implements IEcholocationSystem {

    public Dolphin(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The dolphin are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }

    @Override
    public void emitSound(int frequency) {
        System.out.println("Sound of dolphin echolocation");
    }
}
