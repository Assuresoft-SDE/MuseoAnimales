package Animals;

import Interfaces.IDigestiveSystem;
import Interfaces.IRespiratorySystem;
import enums.RespirationType;

public abstract class Animal implements IDigestiveSystem, IRespiratorySystem {

    private AnimalInformation information;

    public Animal(
            String name,
            String scientificName,
            String admissionDate,
            String family
    ){
        this.information = new AnimalInformation(
                name,
                scientificName,
                admissionDate,
                family
        );
    }

    @Override
    public void breath(RespirationType respirationType){
        String typeOfBreathing = "The " + this.information.getName() + " breaths through ";
        typeOfBreathing += respirationType.toString();

        System.out.println(typeOfBreathing);
    }

}
