package Museum;

import Animals.Animal;
import java.util.ArrayList;
import java.util.List;

public class Museum {
    private String name;
    private List<Exhibition> exhibitionList;
    private List<Animal> animalCollection;

    public Museum(String name) {
        this.name = name;
        this.exhibitionList = new ArrayList<>();;
        animalCollection = new ArrayList<>();
    }

    public void setAnimalCollection(List<Animal> animalCollection){
        this.animalCollection = animalCollection;
    }

    /**
     * This method is used for searching a specific animal informacion
     * by it's name. The public method uses another auxiliary private method
     * which implements the searching algorithm JumpSearchAlgorithm
     *
     * @param animalName Animal's name which you want to search information about
     */
    public String searchAnimal(String animalName) {
        int jumpSize = 5;
        int searchedIndex = jumpSearch(animalName, jumpSize);
        return searchedIndex < 0 ? "No se encontro el animal" : getCurrentAnimalName(searchedIndex);
    }

    /**
     * This private method implements the JumpSearchAlgorithm,
     *
     * @param targetAnimalName Animal's name which you want to search information about
     * @param jump             The jump number that the algorithm needs, it's fixed and 5 in this case
     * @return index which specifies the index of the target animal, -1 if it's not found
     */
    private int jumpSearch(String targetAnimalName, int jump) {
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
            index += jump;
        }
        if (lowerIndex == -1) return -1;
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
}
