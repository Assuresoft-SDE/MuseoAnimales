package animals;

import enums.DigestionType;
import enums.RespirationType;

public class Deer extends Animal {
    private int antler;
    private static final int MAX_ANTLERS = 2;

    public Deer(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType,
            int antlers
    ) {
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
        addAntlers(antlers);
    }

    public String getAntlers() {
        AnimalInformation information =
                super.getInformation();
        String name = information.getName();
        String antlerQuantity = (this.antler == MAX_ANTLERS) ? "antlers" : "antler";

        return (
                "The deer " + name + " has " + this.antler + " " + antlerQuantity
        );
    }

    private void addAntlers(int antler) {
        if (antler > 0) {
            this.antler = Math.min(antler, MAX_ANTLERS);
        }
    }
}
