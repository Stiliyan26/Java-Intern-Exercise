import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChallenge {
    public static void main(String[] args) {
        String emailText = """
                john.boy@valid.com
                john.boy@invalid
                jane.doe-smith@valid.co.uk
                jane_Doe1976@valid.co.uk
                bob-1964@valid.net
                bob!@invalid.com
                elaine@valid-test.com.au
                elaineinvalid1983@.com
                david@valid.io
                david@invalid..com
                """;

        Pattern partialPattern = Pattern
                .compile("(.+)@(.+)");

        Matcher emailMatcher = partialPattern.matcher(emailText);
        emailMatcher.results().forEach(mr -> {
            System.out.printf("[username=%s, domain=%s]%n",
                    mr.group(1),
                    mr.group(2));
        });
    }
}
