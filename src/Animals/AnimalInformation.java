package Animals;

public class AnimalInformation {
    private String name;
    private String scientificName;
    private String admissionDate;
    private String family;

    public AnimalInformation (
            String name,
            String scientificName,
            String admissionDate,
            String family
    ){
        this.name = name;
        this.scientificName = scientificName;
        this.admissionDate = admissionDate;
        this.family = family;
    }

    public String getAnimalInformation() {
        return
                this.name + "\n" +
                this.scientificName + "\n" +
                this.admissionDate + "\n" +
                this.family + "\n";
    }

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
