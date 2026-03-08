enum Geometry{
    LINE, POINT, POLYGON;
}

enum Color {
    BLACK, BLUE, GREEN, ORANGE, PURPLE, RED;
}

enum PointMarker{
    CIRCLE, PUSH_PIN, STAR, SQUARE, TRIANGLE;
}

enum LineMarker{
    DASHED, DOTTED, SOLID;
}

public interface Mappable {
    String JSON_PROPERTY = """
            "properties":{%s}""";

    String getLabel();
    String getMarker();
    Geometry getShape();

    default String toJson(){
        return """
                "type": "%s", "label": "%s", "marker": "%s", """.formatted(getShape(), getLabel(), getMarker());
    }

    static void mapIt(Mappable mappable){
        System.out.println(JSON_PROPERTY.formatted(mappable.toJson()));
    }
}
