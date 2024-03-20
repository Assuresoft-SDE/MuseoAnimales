package museum;

import animals.Animal;

import java.util.Collections;
import java.util.List;

public class AnimalFinder {

    public AnimalFinder(){
    }


    /**
     * This private method implements the JumpSearchAlgorithm,
     *
     * @param targetAnimalName Animal's name which you want to search information about
     * @param jump             The jump number that the algorithm needs, it's fixed and 5 in this case
     * @return index which specifies the index of the target animal, -1 if it's not found
     */
    public int jumpSearchAlgorithm(String targetAnimalName, int jump, List<Animal> animalCollection) {
        Collections.sort(animalCollection);
        int index = 0, lowerIndex = -1;
        boolean continueSearching = true;
        while (index < animalCollection.size() && continueSearching) {
            String currentAnimalName = getCurrentAnimalName(index,animalCollection);
            if (currentAnimalName.compareTo(targetAnimalName) > 0) {
                lowerIndex = index - jump;
                continueSearching = false;
            }
            else if (currentAnimalName.compareTo(targetAnimalName) == 0) {
                return index;
            }
            else {
                lowerIndex = index;
            }
            index += jump;
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
    private String getCurrentAnimalName(int index,List<Animal> animalCollection) {
        return animalCollection.get(index).getInformation().getName();
    }
}
