package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.IAsexualReproductionSystem;

public class Starfish extends Animal implements IAsexualReproductionSystem {

    public Starfish(
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
     * @return /Animal object instance of a Catfish
     */
    @Override
    public Animal reproduce() {
        String childName =
                this.getInformation().getName() + " JR";

        return new Starfish(
                childName,
                this.getInformation().getScientificName(),
                this.getInformation().getAdmissionDate(),
                this.getInformation().getFamily(),
                this.getDigestionType(),
                this.getRespirationType()
        );
    }
}
