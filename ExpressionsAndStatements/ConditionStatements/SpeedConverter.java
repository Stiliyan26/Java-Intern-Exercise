package ExpressionsAndStatements.ConditionStatements;
public class SpeedConverter {
    public static void main(String[] args) {
        long miles = toMilesPerHour(10.25);

        System.out.println("The number is " + miles);
        printConversion(-2.0);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }

        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = Math.round(kilometersPerHour * 0.621371);

            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
