package tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {


//     Napisz program obliczający BMI (Body Mass Index) i sprawdzający, czy jest ono w normie.
//     Program powinien wczytywać od użytkownika dwie zmienne: wagę w kilogramach (typ float) oraz wzrost w centymetrach
//     (typ int). BMI powinno zostać wyliczone zgodnie z poniższym wzorem:
//     wzor
//     Optymalny zakres BMI wynosi od 18.5 do 24.9, wartości mniejsze lub większe są wartościami nieoptymalnymi.
//     Twój program powinien wypisać „BMI optymalne” lub „BMI nieoptymalne”, zgodnie z powyższymi założeniami

        float waga;
        int wzrost;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoją wagę.");
        waga = scanner.nextFloat();

        System.out.println("Podaj swój wzrost.");
        wzrost = scanner.nextInt();

        double bmi =  waga / Math.pow(wzrost / 100, 2);
        System.out.println(bmi);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI optymalne");
        } else {
            System.out.println("BMI nieoptymalne");
        }

        


    }
}
