package MyExercises;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {

//        1. Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią,
//        a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
//        podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
//        15.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random number.");
        int positiveNumber = scanner.nextInt();

        if (positiveNumber <= 0) {
            System.out.println("Your number is too small. Try again.");
        }

        for (int i = 1; i <= positiveNumber; i += 2) {
            System.out.println(i);
        }

//        2. Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
//         A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
//        (A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
//        while, do-while, for.
//        Przykład:
//        Dla A = 4 i B = 11 program powinien wyświetlić:
//        60
//        60
//        60

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter your first number.");
        int firstNumber = scanner1.nextInt();
        System.out.println("Enter your second number.");
        int secondNumber = scanner1.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println("Wrong numbers.");
        }

        int suma = 0;
        while (firstNumber <= secondNumber) {
            suma += firstNumber;
            firstNumber++;
        }
        System.out.println(suma);

        suma = 0;
        do {
            firstNumber++;


        } while (firstNumber <= secondNumber);
        System.out.println(suma);

//        3. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
//        następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
//        liczba. Przykładowo, dla liczby 71 program powinien wyświetlić:
//        1
//        2
//        4
//        8
//        16
//        32
//        64

//        4. Napisać program, który wczytuje liczby podawane przez użytkownika dotąd, dopóki nie podana zostanie liczba 0.
//        Następnie wyświetlić sumę wszystkich podanych liczb.

//        5. Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
//        danych kończone jest podaniem wartości 0 (nie wliczana do danych).
//        W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
//        podanych liczb oraz ich średnią arytmetyczną.
//        Przykład:
//        Użytkownik podał ciąg: 1, -4, 2, 17, 0.
//        Wynik programu:
//        13 // suma min. i maks.
//        6.5 // średnia

//        6. Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
//        (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości. Jeżeli podana wartość jest:
//        • większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
//        • mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
//        • identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra
//        się kończy.

//        7. Napisać program działający w trybie konsolowym (tekstowym) i rysujący na ekranie prostokąt.
//        Użytkownik podaje znak wypełnienia prostokąta, pozycję lewego
//        górnego rogu prostokąta (x, y) oraz długości boków prostokąta (ab). Przyjmujemy,
//        że lewy górny narożnik konsoli ma współrzędne (x, y) = (1, 1).
//        Przykład: x=6, y=3, a=4, b=6, zn=’x’
//        >
//        >
//        > _____xxxxxx
//        > _____xxxxxx
//        > _____xxxxxx
//        > _____xxxxxx
//        ozn.
//        > - nowa linia,
//        _ - znak spacji.

//        8. Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
//        Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą
//        wysokość choinki (liczbę wierszy).
//        Przykład: dla n = 5 wynik powinien wyglądać następująco:
//             *
//            ***
//           *****
//          *******
//         *********

//        9. Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
//        • oblicza sumę cyfr tej liczby,
//        • stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
//        cyfr nieparzystych.

//        10. Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
//        Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.

//        11. Napisać program, który sprawdza, czy podana liczba całkowita n, n > 1, jest
//        liczbą pierwszą.



    }
}
