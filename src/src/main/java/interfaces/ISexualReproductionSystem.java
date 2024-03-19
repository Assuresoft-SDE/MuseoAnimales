package interfaces;

import animals.Animal;

public interface ISexualReproductionSystem {

    /**
     * This method implements a sexual reproduction
     * @param /Animal mate object representing the mate as input
     * @return Animal object representing the offspring resulting
     * from the sexual reproduction with the provided mate.
     */
    Animal reproduce(Animal mate);
}
