package Animals;

import enums.DigestionType;

public class Condor extends Animal{

    public Condor(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The condor are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }
}
