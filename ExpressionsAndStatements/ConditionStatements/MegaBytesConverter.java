package ExpressionsAndStatements.ConditionStatements;
public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int remaining = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + remaining + " KB");
        }
    }
}
