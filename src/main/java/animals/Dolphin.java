package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.IEcholocationSystem;

public class Dolphin extends Animal implements IEcholocationSystem {

    public Dolphin(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType
    ) {
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
    }

    @Override
<<<<<<<< HEAD:src/src/main/java/animals/Dolphin.java
    public String emitFrequency(int frequency) {
        return "The dolphin emits frequency of " + frequency;
========
    public void emitFrequency(int frequency) {
        String frequencyToEmit = "The dolphin emits frequency of " + frequency;
        System.out.println(frequencyToEmit);
>>>>>>>> develop:src/main/java/animals/Dolphin.java
    }
}
