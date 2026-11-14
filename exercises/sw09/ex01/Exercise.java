package sw09.ex01;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class Exercise {
    public static void main(String[] args) {
        String[] namesArray = {"Joe", "Tara", "Sue", "Tim" };
        printOptional(reduceAndPrintStrings(namesArray), "[Default]");
        printOptional(reduceAndPrintStrings(new String[] {}), "[Default]");
    }

    public static Optional<String> reduceAndPrintStrings(String[] namesArray) {
        var result = Arrays.stream(namesArray)
                .filter(Objects::nonNull)
                .filter(s -> s.startsWith("T"))
                .map(String::toUpperCase)
                .reduce((s,t) -> s + " " + t);

        result.ifPresent(s -> System.out.println("[Debugoutput] x = " + s));
        return result;
    }

    public static void printOptional(Optional<String> optionalString, String defaultValue) {
        System.out.println("value = " + optionalString.orElse(defaultValue));
    }
}


/**
 * ------------------- a) ------------------
 * Der Datentyp Optionl wurde eingeführt um ein typisierts null zu erhalten.
 * Durch Optional kann im Beispiel ausgedrückt werden, dass entweder ein String
 * oder null retourniert werden kann.
 */