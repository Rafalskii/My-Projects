package MyExercises;

import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {


//        1. Napisać program służący do konwersji wartości temperatury podanej w stopniach
//        Celsjusza na stopnie w skali Fahrenheita (stopnie Fahrenheita = 1.8 * stopnie
//        Celsjusza + 32.0)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Celsius degrees!");
        float tempInCelsius = scanner.nextFloat();
        float tempInFarenheit = 1.8f * tempInCelsius + 32.0f;
        System.out.println("Temp in Farenheit: " + tempInFarenheit);


//        2. Wczytać od użytkownika 3 liczby całkowite i wypisać na ekran największą oraz
//        najmniejszą z nich.

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter three numbers.");

        int numberOne = scanner1.nextInt();
        int numberTwo = scanner1.nextInt();
        int numberThree = scanner1.nextInt();

        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println(numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }
        if (numberOne < numberTwo && numberOne < numberThree) {
            System.out.println(numberOne);
        } else if (numberTwo < numberOne && numberTwo < numberThree) {
            System.out.println(numberTwo);
        } else {
            System.out.println(numberThree);
        }

//        3. Napisać program, który oblicza wartość współczynnika BMI (ang. body mass
//        index) wg. wzoru: waga
//        wzrost2 . Jeżeli wynik jest w przedziale (18,5 - 24,9) to wypisuje
//        ”waga prawidłowa”, jeżeli poniżej to ”niedowaga”, jeżeli powyżej ”nadwaga”.


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter your weight!");
        int weight = scanner2.nextInt();

        System.out.println("Enter your height");
        double height = scanner2.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.println("Your BMI: " + BMI);

        if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your weight is correct.");
        } else if (BMI > 24.9) {
            System.out.println("Overweight!");
        } else {
            System.out.println("Underweight!");
        }


//        4. Napisać program obliczający należny podatek dochodowy od osób fizycznych.
//        Program ma pobierać od użytkownika dochód i po obliczeniu wypisywać na ekranie
//        należny podatek. Podatek obliczany jest wg. następujących reguł:
//        • do 85.528 podatek wynosi 18% podstawy minus 556,02 PLN,
//        • od 85.528 podatek wynosi 14.839,02 zł + 32% nadwyżki ponad 85.528,00

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter your income.");
        double income = scanner3.nextDouble();

        if (income <= 85528.0) {
            double smallerIncome = income * 0.18 - 556.02;
            if (smallerIncome < 0) {
                smallerIncome = 0;
            }
            System.out.println(smallerIncome);

        } else {
            System.out.println(14839.02 + 0.32 * (income - 85528.0));
        }

//        5. W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna. Napisz program
//        umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt. Danymi
//        wejściowymi dla programu są:
//        • cena towaru (od 100 zł do 10 tyś. zł),
//        • liczba rat (od 6 do 48).
//        Kredyt jest oprocentowany w zależności od liczby rat:
//        • od 6–12 wynosi 2.5% ,
//        • od 13–24 wynosi 5%,
//        • od 25–48 wynosi 10%.
//        Obliczona miesięczna rata powinna zawierać również odsetki. Program powinien
//        sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w
//        przypadku błędu pytać prosić użytkownika ponownie o podanie danych.


        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter your amount.");
        double amount = scanner4.nextDouble();
        System.out.println("Enter your number of installments.");
        int numberOfInstallments = scanner4.nextInt();


        if (amount < 100 || amount > 10000) {
            numberOfInstallments = 36;
        }

        double loanInterest;
        if (numberOfInstallments <= 12) {
            loanInterest = 0.025;
        } else if (numberOfInstallments <= 24) {
            loanInterest = 0.05;
        } else {
            loanInterest = 0.1;
        }
        System.out.println(amount * (1.0 + loanInterest) / numberOfInstallments);

//        6. Napisać program realizujący funkcje prostego kalkulatora, pozwalającego na wykonywanie operacji dodawania,
//        odejmowania, mnożenia i dzielenia na dwóch liczbach rzeczywistych. Program ma identyfikować sytuację wprowadzenia błędnego
//        symbolu działania oraz próbę dzielenia przez zero. Zastosować instrukcję switch
//        do wykonania odpowiedniego działania w zależności od wprowadzonego symbolu
//        operacji. Scenariusz działania programu:
//        a) Program wyświetla informację o swoim przeznaczeniu.
//        b) Wczytuje pierwszą liczbę.
//        c) Wczytuje symbol operacji arytmetycznej: +, -, *, /.
//        d) Wczytuje drugą liczbę.
//        e) Wyświetla wynik lub - w razie konieczności - informację o niemożności wykonania działania.
//        f) Program kończy swoje działanie po naciśnięciu przez użytkownika klawisza
//        Enter.

        Scanner scanner5 = new Scanner(System.in);

        System.out.println("Enter first number!");
        int firstNumber = scanner5.nextInt();

        System.out.println("Enter your operation sign.");
        char operationSign = scanner5.next().charAt(0);

        System.out.println("Enter your second number!");
        int secondNumber = scanner5.nextInt();

        switch (operationSign) {
            case '-':
                System.out.println("The result of the subtraction: " + (firstNumber - secondNumber));
                break;
            case '+':
                System.out.println("The result of the addition: " + firstNumber + secondNumber);
                break;
            case '*':
                System.out.println("The result of the multiplication: " + firstNumber * secondNumber);
                break;
            case '/':
                System.out.println("The result of the division: " + firstNumber / secondNumber);
                break;
            default:
                System.out.println("Valid sign. Try again.");
                break;
        }
    }
}
