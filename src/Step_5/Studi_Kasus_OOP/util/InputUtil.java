package Step_5.Studi_Kasus_OOP.util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static String input(String data) {
        System.out.print(data + " : ");
        String result = scanner.nextLine();
        return result;
    }
}
