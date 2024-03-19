package animals;

import enums.DigestionType;
import enums.RespirationType;
import interfaces.ISexualReproductionSystem;

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

    /**
     * @Inheritdoc
     * @return /Animal object in case the mate is a instance of a Cougar
     * @return null in case the mate is not a instance of a Cougar
     */
    @Override
<<<<<<<< HEAD:src/src/main/java/animals/Cougar.java
    public Animal reproduce(Animal mate) {
        if (!(mate instanceof Cougar)) {
            return null;
        }
        String childName =
                this.getInformation().getName() + " " +
                        mate.getInformation().getName();
========
    public Animal reproduce(Animal couple) {
        if (!( couple instanceof Cougar )) {
            return null;
        }
        String childName = this.getInformation().getName() + " " +
                couple.getInformation().getName();
>>>>>>>> develop:src/main/java/animals/Cougar.java

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
