package Animals;

import Enums.DigestionType;
import Enums.RespirationType;
import Interfaces.ISexualReproductionSystem;

public class Cougar extends Animal implements ISexualReproductionSystem {

    public Cougar(
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
        if (!(couple instanceof Cougar)) {
            return null;
        }
        String childName =
                this.getInformation().getName() + " " +
                        couple.getInformation().getName();

        return new Cougar(
                childName,
                this.getInformation().getScientificName(),
                this.getInformation().getAdmissionDate(),
                this.getInformation().getFamily(),
                this.getDigestionType(),
                this.getRespirationType()
        );
    }
}
