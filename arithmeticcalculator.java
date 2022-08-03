import java.util.Scanner;
 
public class arithmeticcalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        // taking inp5ut from the user using the Scanner
        // class
        System.out.print(
            "Enter the first and the Second number - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
 
        // selecting the operand for the calculations
        System.out.print(
            "Choose and Enter the type of operation you want to perform (+, -, *, /, %)  ");
        char oper = sc.next().charAt(0);
        solve(a, b, oper);
    }
    public static int solve(int a, int b, char oper)
    {
        int res = 0;
        // addition
        if (oper == '+') {
            res = a + b;
            // subtraction
        }
        else if (oper == '-') {
            res = a - b;
            // multiplication
        }
        else if (oper == '*') {
            res = a * b;
            // modulo
        }
        else if (oper == '%') {
            res = a % b;
            // division
        }
        else if (oper == '/') {
            res = a / b;
        }
        else 
        {
        	System.out.println("wrong choice");
        }
        // printing the final result
        System.out.println("Your answer is - " + res);
        return res;
    }
}

