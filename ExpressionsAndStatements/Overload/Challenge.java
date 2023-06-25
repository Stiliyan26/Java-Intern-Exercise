package ExpressionsAndStatements.Overload;
public class Challenge {
    public static void main(String[] args) {
        int heightInches = 20;
        double heightInSm = convertToCentimeters(heightInches);
        System.out.println("Height in inches: " + heightInches);
        System.out.println("Height in sm: " + heightInSm);

        double sm = convertToCentimeters(5, 8);
        System.out.println("Height in sm2: " + sm);

    }
    public static double convertToCentimeters(int heightInches){
        return heightInches * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int remainingHeightInches){
        int totalInches = heightInFeet * 12 + remainingHeightInches;

        return convertToCentimeters(totalInches);
    }
}


