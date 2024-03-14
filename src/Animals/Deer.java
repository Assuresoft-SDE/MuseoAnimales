package Animals;

import Enums.DigestionType;
import Enums.RespirationType;

public class Deer extends Animal{
    private int antler;
    private final int MAX_ANTLERS = 2;

    public Deer(
            String name,
            String scientificName,
            String admissionDate,
            String family,
            DigestionType digestionType,
            RespirationType respirationType,
            int antlers
    ){
        super(name, scientificName, admissionDate, family, digestionType, respirationType);
        addAntlers(antlers);
    }

    public void getAntlers(){
        AnimalInformation information =
                super.getInformation().getAnimalInformation();
        String name = information.getName();
        String antlerQuantity = (this.antler == MAX_ANTLERS)? "antlers": "antler";

        System.out.println(
                "The deer " + name + " has " + this.antler + " " + antlerQuantity
        );
    }

    private void addAntlers(int antler){
        if(antler > 0){
            this.antler = Math.min(antler, MAX_ANTLERS);
        }
    }
}
