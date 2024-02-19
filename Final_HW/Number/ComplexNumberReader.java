package Final_HW.Number;

import java.util.Scanner;

public class ComplexNumberReader {

    public static ComplexNumber read() {

        Scanner sc = new Scanner(System.in);
        double real;
        double imaginary;

        System.out.print("Введите действительную часть числа: ");

        if (sc.hasNextDouble()) {
            real = sc.nextDouble();
        } else {
            System.out.println("Ошибка! Попробуйте снова!");
            sc.next();
            real = sc.nextDouble();

        }

        System.out.print("Введите мнимую часть числа: ");
        if (sc.hasNextDouble()) {
            imaginary = sc.nextDouble();
        } else {
            System.out.println("Ошибка! Попробуйте снова!");
            sc.next();
            imaginary = sc.nextDouble();

        }

        return new ComplexNumber(real, imaginary);
    }

}
