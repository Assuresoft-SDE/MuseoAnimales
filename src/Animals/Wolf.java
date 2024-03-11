package Animals;

import enums.DigestionType;

public class Wolf extends Animal{

    public Wolf(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The wolf are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }
}
