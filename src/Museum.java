import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Museum {
    private String name;
    private List<Exhibition> exhibitionList;
    private List<Animal> animalCollection;

    public Museum(String name, List<Exhibition> exhibitions) {
        this.name = name;
        this.exhibitionList = exhibitions;
        animalCollection = new ArrayList<>();
    }

    public String searchAnimal(Animal animal) {
        String animalName = animal.getName();
        int searchedIndex = jumpSearch(animalName, 5);
        if (searchedIndex < 0) {
            return "No es encontro el animal.";
        } else {
            return animalCollection.get(searchedIndex).getInformation();
        }
        return "";
    }

    private int jumpSearch(String targetAnimalName, int jump) {
        int index = 0, lowerIndex = -1;
        boolean continueSearching = true;
        while (index < animalCollection.size() && continueSearching) {
            String currentAnimalName = animalCollection.get(index).getName();
            if (currentAnimalName.compareTo(targetAnimalName) > 0) {
                lowerIndex = index - jump;
                continueSearching = false;
            } else if (currentAnimalName.compareTo(targetAnimalName) == 0) {
                return index;
            }
            index += jump;
        }
        if (lowerIndex == -1) return -1;
        while (lowerIndex < animalCollection.size()) {
            String currentAnimalName = animalCollection.get(lowerIndex).getName();
            if(currentAnimalName.compareTo(targetAnimalName) == 0){
                return lowerIndex;
            }
            lowerIndex += 1;
        }
        return -1;
    }
}
