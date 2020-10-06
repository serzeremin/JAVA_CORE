package lesson001.Task001;

import java.util.Scanner;

public class SantimetersToMeters {
    void convertToMeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое положительное целое число в сантиметрах: ");
        double santimeters = scanner.nextDouble();
        while (santimeters < 0){
            System.out.println("Вы ввели отрицательное число, попробуйте еще раз: ");
            scanner.nextDouble();
        }
        while (santimeters % 1 != 0){
            System.out.println("Вы ввели не целое число, попробуйте еще раз: ");
            scanner.nextDouble();
        }
        int meters = (int) santimeters / 100;
        System.out.println("Количество полных метров в " + (int) santimeters + " сантиметрах = " + meters);
    }
}
//
class Test{
    public static void main(String[] args) {
        SantimetersToMeters object = new SantimetersToMeters();
        object.convertToMeters();
    }
}
