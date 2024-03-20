package interfaces;

public interface IEcholocationSystem {

    /**
     * This method implements emitFrequency for each animal, that has
     * this property.
     * @param /int frequency of each animal
     * @return String with the type of animal and the frequency that emits
     */
    String emitFrequency(int frequency);
}
