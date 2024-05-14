import java.util.List;
import java.util.regex.Pattern;

public class RegexInJava {

    static final Pattern DMYDateFormat = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    public static void main(String[] args) {

        List<String> testStrings = List.of(
                "2",
                "22-01-1000",
                "8a-k-8888",
                "11--12-9000",
                "",
                "-ab-77-0909"
        );

        testStrings.forEach(s -> {
            System.out.println(s + ": " + DMYDateFormat.matcher(s).matches());
        });

    }

}
