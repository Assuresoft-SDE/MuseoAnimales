package Enums;

public enum RespirationType {
    PULMONARY("lungs"),
    BRANCHIAL("gills"),
    TRACHEAS("trachea"),
    CUTANEOUS("skin");

    private String organ;

    RespirationType(String organ){
        this.organ = organ;
    }

    @Override
    public String toString() {
        return this.organ;
    }
}
