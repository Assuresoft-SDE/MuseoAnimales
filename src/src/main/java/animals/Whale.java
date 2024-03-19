package animals;

import enums.DigestionType;
import enums.RespirationType;

public class Whale extends Animal {

    public Whale(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType
    ) {
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
    }
}
