package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.IDigestiveSystem;
import interfaces.IRespiratorySystem;
import java.util.Locale;

public abstract class Animal implements IDigestiveSystem, IRespiratorySystem, Comparable<Animal> {
    private AnimalInformation information;
    private DigestionType digestionType;
    private RespirationType respirationType;

    protected Animal(
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
        return this.information;
    }

<<<<<<<< HEAD:src/src/main/java/animals/Animal.java
========
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
    public int compareTo(Animal anotherAnimal) {
        String name = this.getInformation().getName();
        String otherAnimalName = anotherAnimal.getInformation().getName();
        return name.compareTo(otherAnimalName);
    }

>>>>>>>> develop:src/main/java/Animals/Animal.java
    public DigestionType getDigestionType() {
        return digestionType;
    }

    public RespirationType getRespirationType() {
        return respirationType;
    }
<<<<<<<< HEAD:src/src/main/java/animals/Animal.java

    /**
     * @inheritDoc
     * IRespiratorySystem.breath()
     * @return string
     */
    @Override
    public String breath() {
        String animalName = this.information.getName();
        String animalType = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);

        String typeOfBreathing = animalName + " the " + animalType + " breathes through ";
        typeOfBreathing += this.respirationType.toString();

        return typeOfBreathing;
    }

    /**
     * @inheritDoc
     * @return string
     */
    @Override
    public String digest() {
        String animalName = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);
        String typeOfDigest = "The " + animalName;

        typeOfDigest += " is " + this.digestionType.toString();

        return typeOfDigest;
    }

    /**
     * This public method override the method compareTo of Object to compare Animal,
     * through their names.
     * @param /Animal otherAnimal animal to be compared
     * @return int negative integer, zero, or a positive integer as this object is less than,
     * equal to, or greater than the specified object.
     */
    @Override
    public int compareTo(Animal otherAnimal){
        String otherName = otherAnimal.getInformation().getName();
        return this.getInformation().getName().compareTo(otherName);
    }
========
>>>>>>>> develop:src/main/java/Animals/Animal.java
}
