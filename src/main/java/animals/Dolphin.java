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
    public void emitFrequency(int frequency) {
        String frequencyToEmit = "The dolphin emits frequency of " + frequency;
        System.out.println(frequencyToEmit);
    }
}
