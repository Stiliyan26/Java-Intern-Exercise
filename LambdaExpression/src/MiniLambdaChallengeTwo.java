import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MiniLambdaChallengeTwo {
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();

        for (int i = 0; i < source.length(); i += 2) {
            returnVal.append(source.charAt(i));
        }

        return returnVal.toString();
    }

    public static void main(String[] args) {
        Function<String, String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();

            for (int i = 0; i < source.length(); i += 2) {
                returnVal.append(source.charAt(i));
            }

            return returnVal.toString();
        };

        UnaryOperator<String> everySecondChar2 = source -> {
            StringBuilder returnVal = new StringBuilder();

            for (int i = 0; i < source.length(); i += 2) {
                returnVal.append(source.charAt(i));
            }

            return returnVal.toString();
        };

        System.out.println(everySecondChar2.apply("1234567890"));

        String result =
                everySecondCharacter(everySecondChar2, "1234567890");

        System.out.println(result);

        Supplier<String> iLoveJava = () -> "I love Java!";
        Supplier<String> iLoveJava2 = () -> {
            return "I love Java";
        };

        System.out.println(iLoveJava.get());
        System.out.println(iLoveJava2.get());
    }

    public static String everySecondCharacter
            (Function<String, String> func, String source) {
        return func.apply(source);
    }
}

