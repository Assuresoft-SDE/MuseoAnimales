package enums;

public enum RespirationType {
    PULMONARY("lungs"),
    BRANCHIAL("gills"),
    TRACHEAS("trachea"),
    CUTANEOUS("skin");

    private String value;

    RespirationType(String value){
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
