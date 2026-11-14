package sw09.ex04;

import java.util.List;

public class Exercise {

    public static void main(String[] args) {
        System.out.println(join(List.of("Java", "is", "cool")) + ".");
    }

    public static String join(Iterable<String> strings) {
        StringBuilder sb = new StringBuilder();

        for (String s : strings) {
            sb.append(s)
                .append(" ");
        }

        return sb.substring(0, sb.length() - 1);
    }
}

/**
 * ---------------- b) ------------------------
 * Typisch für die Imperative Programmierung ist das genau Anweisen wie der String zusammengesetzt und das
 * Verändern von State.
 * So wird z.B. ein enhanced-For-Loop genutzt welcher s immer wieder neu setzt, und der State des sb wird auch immer
 * erweitert.
 * Wir definieren den gesamten Kontrollfluss: 1. Iteriere über alle Strings, füge diese dem sb hinzu füge ein ' '
 * hinzu und ganz am Schluss lösche den letzten ' '.
 */

/**
 * ---------------- c) ------------------------
 *  Bei funktionaler Programmierung wird deklarativ das gewünschte Ergebnis beschrieben, und nicht wie das Ziel
 *  erreicht werden soll. Auch wird bei funktionaler Programmierung kein mutable State verwendet.
 */

/**
 * ---------------- d) ------------------------
 *  - Weniger Code
 *  - Fokus auf Businesslogik und nicht auf Kontrollfluss
 *  - Kleinere (meist lesbarer) Programme.
 */