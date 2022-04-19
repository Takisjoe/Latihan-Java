package Step_4.Java_Standard_Classes;

import java.util.Locale;

public class StringApp {
    public static void main(String[] args) {
        String sample = "Celvinanda Octiwan";

        System.out.println(sample.toLowerCase(Locale.ROOT));
        System.out.println(sample.toUpperCase(Locale.ROOT));
        System.out.println(sample.codePointCount(0,sample.length()));

        String[] nama = sample.split(" ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i]);
        }
        System.out.println("    ".isBlank());
        System.out.println(" ".isEmpty());
    }
}
