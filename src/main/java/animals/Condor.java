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
     * @return /Animal object in case the mate is a instance of a Condor
     * @return null in case the mate is not a instance of a Condor
     * @Inheritdoc
     */
    @Override
    public Animal reproduce(Animal mate) {
        if (!(mate instanceof Condor)) {
            return null;
        }
        String childName = this.getInformation().getName() + " " +
                mate.getInformation().getName();

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
