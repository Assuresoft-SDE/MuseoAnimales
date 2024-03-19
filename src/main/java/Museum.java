import Animals.Animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Museum {
    private String name;
    private List<Exhibition> exhibitionList;
    private List<Animal> animalCollection;

    public Museum(String name) {
        this.name = name;
        exhibitionList = new ArrayList<>();
        animalCollection = new ArrayList<>();
    }


    /**
     * This method is used for adding a new collection of animals to
     * the museum.
     *
     * @param animalCollection New collection of animals
     */
    public void addAnimalCollection(List<Animal> animalCollection) {
        this.animalCollection = animalCollection;
    }

    /**
     * This method is used for searching a specific animal informacion
     * by it's name. The public method uses another auxiliary private method
     * which implements the searching algorithm JumpSearchAlgorithm.
     * Animal collection will be sorted by default each time we want to search
     * cause it's a requirement for the algorithm to work.jjjjj
     *
     * @param animalName Animal's name which you want to search information about
     */
    public String searchAnimal(String animalName) {
        Collections.sort(animalCollection);
        int jumpSize = 5;
        int searchedIndex = jumpSearchAlgorithm(animalName, jumpSize);
        return searchedIndex < 0 ?
                "No se encontro el animal." :
                getCurrentAnimalName(searchedIndex) + " se encuentra en el museo.";
    }

    /**
     * This private method implements the JumpSearchAlgorithm,
     *
     * @param targetAnimalName Animal's name which you want to search information about
     * @param jump             The jump number that the algorithm needs, it's fixed and 5 in this case
     * @return index which specifies the index of the target animal, -1 if it's not found
     */
    private int jumpSearchAlgorithm(String targetAnimalName, int jump) {
        int index = 0, lowerIndex = -1;
        boolean continueSearching = true;
        while (index < animalCollection.size() && continueSearching) {
            String currentAnimalName = getCurrentAnimalName(index);
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
    private String getCurrentAnimalName(int index) {
        return animalCollection.get(index).getInformation().getName();
    }

    private String getCurrentAnimalType(int index) {
        return animalCollection.get(index).getClass().toString();
    }
}
