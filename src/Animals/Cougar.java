package Animals;


import enums.DigestionType;

public class Cougar extends Animal{

    public Cougar(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }

    @Override
    public void digest(DigestionType digestionType) {
        String typeOfDigest = "The cougar are ";
        typeOfDigest += digestionType.toString();

        System.out.println(typeOfDigest);
    }

}
