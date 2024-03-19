package Enums;

public enum DigestionType {
    HERVIBORE("herbivorous"),
    OMNIVORE("omnivorous"),
    CARNIVORE("carnivorous");

    private String value;

    DigestionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
