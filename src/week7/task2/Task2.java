package week7.task2;

import week7.task1.Addition;
import week7.task1.Expression;
import week7.task1.Numeral;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void readFromFile(String path) throws IOException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.next());
        System.out.println(scanner.next());
    }

    public static int tongNghichDao(int[] array) throws ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException {
        int sum = 1 / array[0];
        for (int i = 1; i < 2; i++){
            sum += 1/ array[i];
        }
        return sum;
    }

    public static void castException(Expression e) throws ClassCastException{
        System.out.println(((Numeral) e).evaluate());
    }

    public static void main(String[] args){
        try {
            readFromFile("notExist");
        }
        catch (IOException e){
            System.out.println("lỗi ko tìm được file");
        }
        int[] test1 = {1, 3, 4};
        int[] test2 = {0, 4};
        try {
            System.out.println(tongNghichDao(test1));
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("lỗi array index");
        }

        try{
            System.out.println(tongNghichDao(null));
        }
        catch (NullPointerException e){
            System.out.println("Lỗi null");
        }

        try {
            System.out.println(tongNghichDao(test2));
        }
        catch (ArithmeticException e){
            System.out.println("arithmetic error");
        }

        try {
            castException(new Addition(new Numeral(1), new Numeral(2)));
        } catch (ClassCastException e){
            System.out.println("lỗi class cast");
        }
    }
}
