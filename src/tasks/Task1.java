package tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        //     Napisz program, który pobierze od użytkownika średnicę okręgu (zmienną typu float) i obliczy obwód tego okręgu.
        //     Do obliczeń przyjmij najpierw π = 3.14, a następnie skorzystaj z wbudowanej klasy Math i znajdującej się tam stałej PI

        final double pi = 3.14;
        float r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę.");
        r = scanner.nextFloat();
        System.out.println("Obwód: " + (2 * pi * r));
    }
}
