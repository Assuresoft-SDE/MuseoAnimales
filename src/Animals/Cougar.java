package Animals;

import Enums.DigestionType;
import Enums.RespirationType;

public class Cougar extends Animal{

    public Cougar(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType
    ){
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
    }
}
