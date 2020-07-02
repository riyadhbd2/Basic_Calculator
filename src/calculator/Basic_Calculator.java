
package calculator;

import java.util.Scanner;


public class Basic_Calculator {
    public static void main(String[] args) {
        double a,b;
        char c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        a = input.nextDouble();
        System.out.println("Enter operator,+,-,*,/");
        c = input.next().charAt(0);
        System.out.println("Enter second number");
        b = input.nextDouble();
        
        double result;
        switch(c){
            case '+':
                result  = a + b;
                System.out.println(a + b);
                break;
            case '-':
                result = a - b;
                System.out.println(a - b);
                break;
            case '*':
                result = a * b;
                System.out.println(a * b);
                break;
            case '/':
                result = a / b;
                System.out.println(a / b);
                break;
            default:
                System.out.println("You have entered wrong information");
         }
        
        }
    }

    }
    }
