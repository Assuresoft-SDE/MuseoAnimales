package Animals;

import Interfaces.IEcholocationSystem;

abstract class Chiropters extends Animal implements IEcholocationSystem {

    public Chiropters(String name, String scientificName, String admissionDate, String family) {
        super(name, scientificName, admissionDate, family);
    }
}
