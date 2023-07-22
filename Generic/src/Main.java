public class Main {
    public static void main(String[] args) {
        var nationalUSPark = new Park[]{
                new Park("Yellow stone", "44.4882 -110.5916"),
                new Park("Grand CAnyon", "36.1085 -112.0965"),
                new Park("Yosemite", "37.8855 -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSPark);
        parkLayer.renderLayer();

        var majorUsRivers = new River[]{
                new River("Missisipi",
                        "47.2160, -95.2348",
                                "29.234, -12.2324",
                                "43.123, -54.123"),
                new River("Missisipi",
                        "48.2160, -25.2348",
                        "24.331, -13.2324")
        };

        Layer<River> riverLayer = new Layer<>(majorUsRivers);
        riverLayer.addElements(new River("Colorado", "50.2160, -22.2348",
                "22.331, -11.2324"),
                new River("Delaware", "50.2160, -22.2348",
                        "22.331, -11.2324"));

        riverLayer.renderLayer();
    }
}
