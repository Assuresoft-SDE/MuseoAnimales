package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.ISexualReproductionSystem;

public class Wolf extends Animal implements ISexualReproductionSystem {

    public Wolf(
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
     * @return /Animal object in case the mate is a instance of a Wolf
     * @return null in case the mate is not a instance of a Wolf
     * @Inheritdoc
     */
    @Override
    public Animal reproduce(Animal mate) {
        if (!(mate instanceof Wolf)) {
            return null;
        }
        String childName =
                this.getInformation().getName() + " " +
                        mate.getInformation().getName();

        return new Wolf(
                childName,
                this.getInformation().getScientificName(),
                this.getInformation().getAdmissionDate(),
                this.getInformation().getFamily(),
                this.getDigestionType(),
                this.getRespirationType()
        );
    }
}
