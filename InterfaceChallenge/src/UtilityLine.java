enum UtilityType{
    ELECTRICAL, FIBER_OPTIC;
}

public class UtilityLine implements Mappable{
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return String.format("%s (%s)", name, type);
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.BLUE + " " + LineMarker.DASHED;
            case FIBER_OPTIC -> Color.BLACK + " " + LineMarker.SOLID;
            default -> Color.ORANGE + " " + LineMarker.DOTTED;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                "name": "%s", "utility": "%s" """.formatted(name,type);
    }
}
