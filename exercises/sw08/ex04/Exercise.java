package sw08.ex04;

import java.util.Arrays;
import java.util.Objects;

public class Exercise {

    public static void main(String[] args) {
        var names = new String[] {"Susanna", "Joe", "Lu", "Timmy", "Rafael", "Lisa"};

        var processedNames = new Exercise().processNames(names);
        System.out.println(processedNames);
    }

    public String processNames(String[] names) {
        return Arrays.stream(names)
                .filter(Objects::nonNull)
                .filter(s -> s.length() >= 3)
                .filter(s -> s.length() <= 4)
                .map(String::toUpperCase)
                .reduce("", (s1, s2) -> s1 + " " + s2);
    }
}
