package InterfsceChallenge;

enum UsageType {ENTERTAIMENT, GOVERMENT, RESEDENTIAL, SPORTS}
public class Building implements Mappable{
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAIMENT -> Color.GREEN + " " + PointMaker.TRIANGLE;
            case GOVERMENT -> Color.RED + " " + PointMaker.STAR;
            case RESEDENTIAL -> Color.BLUE + " " + PointMaker.SQUARE;
            case SPORTS -> Color.ORANGE + " " + PointMaker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMaker.CIRCLE;
        };
    }
}
