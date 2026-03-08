enum UsageType{
    BUSINESS, ENTERTAINMENT, GOVERNMENT;
}

public class Building implements Mappable{
    private String name;
    private UsageType type;

    public Building(String name, UsageType type){
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
            case BUSINESS -> Color.BLACK + " " + PointMarker.SQUARE;
            case ENTERTAINMENT -> Color.BLUE + " " + PointMarker.CIRCLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            default -> Color.GREEN + " " + PointMarker.TRIANGLE;
        };
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String toJson() {
        return Mappable.super.toJson() + """
                "name": "%s", "utility": "%s" """.formatted(name, type);
    }
}
