package ExpressionsAndStatements.ConditionStatements;
public class BarkingDog {
    public static void main(String[] args) {
        boolean isWakedUp = shouldWakeUp(true, 1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || 23 < hourOfDay){
            return  false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        } else {
            return false;
        }
    }
}
