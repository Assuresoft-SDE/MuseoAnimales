package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.ISexualReproductionSystem;

public class Catfish extends Animal implements ISexualReproductionSystem {

    public Catfish(
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
    public Animal reproduce(Animal couple) {
        if (!(couple instanceof Catfish)) {
            return null;
        }
        String childName = this.getInformation().getName() + " " +
                couple.getInformation().getName();
        return new Catfish(
                childName,
                this.getInformation().getScientificName(),
                this.getInformation().getAdmissionDate(),
                this.getInformation().getFamily(),
                this.getDigestionType(),
                this.getRespirationType()
        );
    }
}
