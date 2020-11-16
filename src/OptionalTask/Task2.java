package OptionalTask;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        //2. Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
        Integer number = inputNumber();
        reverseNumber(number);
    }

    public static Integer inputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        int number = 0;
        try{
        number = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Not a number");
        }
        return number;
    }

    public static void reverseNumber(Integer number){
        String numberAsString = number.toString();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i<numberAsString.length(); i++){
            stack.push(numberAsString.charAt(i));
        }
        System.out.print("Number in reverse order: ");
        while (!stack.empty()){
            System.out.print(stack.pop());
        }

    }
}
