package Animals;

import enums.DigestionType;

public class Whale extends Animal{

    public Whale(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The whale are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }
}
