package OptionalTask;

import java.util.EmptyStackException;
import java.util.Stack;

public class Task7 {
    public static void main(String[] args) {
        //Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}».
        // Проверить правильность расстановки скобок. Использовать стек.
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();
        String text = "((sdsd){}[])";
        try {
            for (char symbol: text.toCharArray()){
                if(symbol == '('){
                    stack1.push(symbol);
                } else
                if(symbol == '{'){
                    stack2.push(symbol);
                } else if(symbol == '['){
                    stack3.push(symbol);
                } if(symbol == ')'){
                    stack1.pop();
                } else if(symbol == '}'){
                    stack2.pop();
                } else if(symbol == ']'){
                    stack3.pop();
                }
            }
            System.out.println("RIGHT!");
        }catch (EmptyStackException e) {
            System.out.println("WRONG ORDER!");
        }

    }

}
