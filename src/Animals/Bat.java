package Animals;

import Enums.DigestionType;
import Enums.RespirationType;

public class Bat extends Chiropters{

    public Bat(
            String name,
            String scientificName,
            String admissionDate,
            String family, DigestionType digestionType,
            RespirationType respirationType
    ){
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
    }
}
