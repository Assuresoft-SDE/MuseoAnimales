package museum;

import animals.Animal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Museum {
    private AnimalFinder animalFinder;
    private String name;
    private List<Animal> animalCollection;

    public Museum(String name) {
        this.name = name;
        this.animalCollection = new ArrayList<>();
        this.animalFinder = new AnimalFinder(this.animalCollection);
    }


    /**
     * This method is used for adding a new collection of animals to
     * the museum.
     *
     * @param animalCollection New collection of animals
     */
    public void addAnimalCollection(List<Animal> animalCollection) {
        this.animalCollection = animalCollection;
        this.animalFinder = new AnimalFinder(animalCollection);
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
        int searchedIndex = animalFinder.searchAnimal(animalName, animalCollection);
        return searchedIndex < 0 ?
                "Animal not found." :
                getCurrentAnimalName(searchedIndex) + " is in the museum.";
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

    public AnimalFinder getAnimalFinder() {
        return this.animalFinder;
    }
}
