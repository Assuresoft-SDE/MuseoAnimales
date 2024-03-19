package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.IEcholocationSystem;
import java.util.Locale;

abstract class Chiropters extends Animal implements IEcholocationSystem {

    protected Chiropters(
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
        String animalName = this.getClass().getSimpleName().toLowerCase(Locale.ROOT);
        String frequencyToEmit = "The " + animalName;
        frequencyToEmit += " emits frequency of " + frequency;

        return frequencyToEmit;
    }
}
