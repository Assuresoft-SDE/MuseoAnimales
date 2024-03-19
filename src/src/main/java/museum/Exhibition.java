package museum;

import animals.Animal;

import java.util.List;

public class Exhibition {
    private List<Visitor> assistants;
    private String exhibitionDate;
    private MuseumWorker lecturer;
    private List<Animal> animalsExposed;

    public boolean registerToExhibition() {
        return false;
    }
}
