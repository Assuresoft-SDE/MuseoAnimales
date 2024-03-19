package Animals;

import Enums.DigestionType;
import Enums.RespirationType;
import Interfaces.IDigestiveSystem;
import Interfaces.IRespiratorySystem;

import java.util.Locale;

public abstract class Animal implements IDigestiveSystem, IRespiratorySystem, Comparable<Animal> {

    private AnimalInformation information;
    private DigestionType digestionType;
    private RespirationType respirationType;

    public Animal(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType
    ) {
        this.information = new AnimalInformation(
                name,
                scientificName,
                admissionDate,
                family
        );

        this.digestionType = digestionType;
        this.respirationType = respirationType;
    }

    public AnimalInformation getInformation() {
        return this.information.getAnimalInformation();
    }

    @Override
    public void breath() {
        String animalName = this.information.getName();
        String animalType = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);

        String typeOfBreathing = animalName + " the " + animalType + " breathes through ";
        typeOfBreathing += this.respirationType.toString();

        System.out.println(typeOfBreathing);
    }

    @Override
    public void digest() {
        String animalName = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);
        String typeOfDigest = "The " + animalName;

        typeOfDigest += " is " + this.digestionType.toString();

        System.out.println(typeOfDigest);
    }

    @Override
    public int compareTo(Animal anotherAnimal){
        String name = this.getInformation().getName();
        String otherAnimalName = anotherAnimal.getInformation().getName();
        return name.compareTo(otherAnimalName);
    }

    public DigestionType getDigestionType() {
        return digestionType;
    }

    public RespirationType getRespirationType() {
        return respirationType;
    }
}
