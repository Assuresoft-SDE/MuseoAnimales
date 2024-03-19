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

    /**
     * @Inheritdoc
     */
    @Override
    public String emitFrequency(int frequency) {
        return "The dolphin emits frequency of " + frequency;
    }
}
