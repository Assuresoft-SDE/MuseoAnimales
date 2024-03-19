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

    /**
     * @Inheritdoc
     * @return /Animal object in case the mate is a instance of a Catfish
     * @return null in case the mate is not a instance of a Catfish
     */
    @Override
    public Animal reproduce(Animal mate) {
        if (!(mate instanceof Catfish)) {
            return null;
        }
        String childName =
                this.getInformation().getName() + " " +
                        mate.getInformation().getName();

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
