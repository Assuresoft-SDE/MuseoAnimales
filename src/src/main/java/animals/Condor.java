package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.ISexualReproductionSystem;

public class Condor extends Animal implements ISexualReproductionSystem {

    public Condor(
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
     * @return /Animal object in case the mate is a instance of a Condor
     * @return null in case the mate is not a instance of a Condor
     */
    @Override
    public Animal reproduce(Animal couple) {
        if (!(couple instanceof Condor)) {
            return null;
        }
        String childName =
                this.getInformation().getName() + " " +
                        couple.getInformation().getName();

        return new Condor(
                childName,
                this.getInformation().getScientificName(),
                this.getInformation().getAdmissionDate(),
                this.getInformation().getFamily(),
                this.getDigestionType(),
                this.getRespirationType()
        );
    }
}
