package interfaces;

public interface IRespiratorySystem {

    /**
     * This method implements the breathing method for each animal,
     * @return String with the type of animal and through which organ it breathes
     * depending the type of breathing.
     * Respiration PULMONARY: lungs
     * Respiration BRANCHIAL: gills,
     * Respiration TRACHEAS: trachea,
     * Respirarion CUTANEOUS: skin,
     */
    String breath();
}
