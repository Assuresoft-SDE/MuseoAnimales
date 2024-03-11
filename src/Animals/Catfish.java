package Animals;

import enums.DigestionType;

public class Catfish extends Animal{

    public Catfish(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The catfish are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }

}
