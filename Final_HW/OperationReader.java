package Final_HW;

import java.util.Scanner;

public class OperationReader {

         
    public OperationReader(String operation) {
        getOperation();
    }

    public static String getOperation() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите операцию: +, -, *, / ");
        String oper = sc.nextLine();
        sc.close();
        return oper;

    }
    

}