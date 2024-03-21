package museum;

import animals.Animal;

import java.util.Collections;
import java.util.List;

public class AnimalFinder {
    private final int jumpSize = 5;
    private List<Animal> animalCollection;

    public AnimalFinder(List<Animal> animalCollection) {
        this.animalCollection = animalCollection;
    }

    public int searchAnimal(String animalName, List<Animal> animalCollection) {
        this.animalCollection = animalCollection;
        return this.jumpSearchAlgorithm(animalName);
    }

    /**
     * This private method implements the JumpSearchAlgorithm,
     *
     * @param targetAnimalName Animal's name which you want to search information about
    //* @param jump             The jump number that the algorithm needs, it's fixed and 5 in this case
     * @return index which specifies the index of the target animal, -1 if it's not found
     */
    private int jumpSearchAlgorithm(String targetAnimalName) {
        Collections.sort(animalCollection);
        int index = 0, lowerIndex = -1;
        boolean continueSearching = true;

        while (index < animalCollection.size() && continueSearching) {
            String currentAnimalName = getCurrentAnimalName(index, animalCollection);
            if (currentAnimalName.compareTo(targetAnimalName) > 0) {
                lowerIndex = index - jumpSize;
                continueSearching = false;
            } else if (currentAnimalName.compareTo(targetAnimalName) == 0) {
                return index;
            } else {
                lowerIndex = index;
            }
            index += jumpSize;
        }

        while (lowerIndex < animalCollection.size()) {
            String currentAnimalName = animalCollection.get(lowerIndex).getInformation().getName();
            if (currentAnimalName.compareTo(targetAnimalName) == 0) {
                return lowerIndex;
            }
            lowerIndex += 1;
        }
        return -1;
    }

    /**
     * This method helps us in getting the animal name pointed by the index in animalCollection
     *
     * @param index the  index  ( 0 < index < animalCollection.size() )
     * @return The name of the animal
     */
    private String getCurrentAnimalName(int index, List<Animal> animalCollection) {
        return animalCollection.get(index).getInformation().getName();
    }
}
