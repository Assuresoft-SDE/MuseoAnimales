package animals;

public class AnimalInformation {
    private String name;
    private String scientificName;
    private String admissionDate;
    private String family;

    public AnimalInformation(
            String name,
            String scientificName,
            String admissionDate,
            String family
    ) {
        this.name = name;
        this.scientificName = scientificName;
        this.admissionDate = admissionDate;
        this.family = family;
    }

<<<<<<<< HEAD:src/src/main/java/animals/AnimalInformation.java
    /**
     * This provides a way to access to current AnimalInformation
     * @return the current instance of the AnimalInformation
     * */
    public AnimalInformation getAnimalInformation() {
        return this;
    }
========
>>>>>>>> develop:src/main/java/animals/AnimalInformation.java

    public String getName() {
        return name;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public String getFamily() {
        return family;
    }
}
