package Animals;

import enums.DigestionType;

public class Bat extends Chiropters{

    public Bat(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void emitSound(int frequency) {
        System.out.println("The bat emit frequency: " + frequency);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The bat are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }
}
