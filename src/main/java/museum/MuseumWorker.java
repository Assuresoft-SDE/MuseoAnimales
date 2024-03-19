package museum;

public class MuseumWorker extends Person {

    public Exhibition createExhibition() {
        return new Exhibition();
    }
}
