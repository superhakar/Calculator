package Calculator;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    
    public static double squareRoot (double num)
    {
        return Math.sqrt(num);
    }
    public static int factorial (int num)
    {
        int fact = 1;
        for(int i=1;i<=num;i++) fact = i*fact;
        return fact;
    }
    public static double ln (double num)
    {
        return Math.log(num);
    }
    public static double pow (double num1, double num2)
    {
        return Math.pow(num1, num2);
    }
    
    
    
    public static void squareRootScanner (Scanner sc)
    {
    	System.out.println("Enter number to square root");
        double num = sc.nextDouble();
        double sqrt = squareRoot(num);
        System.out.println("Square root of " + num + " is " + sqrt);
        logger.info("[SQUARE_ROOT] of " + num + " is " + sqrt);
    }
    public static void factorialScanner (Scanner sc)
    {
    	System.out.println("Enter number to get factorial");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("Factorial of" + num + " is " + fact);
        logger.info("[FACTORIAL] of " + num + " is " + fact);
    }
    public static void lnScanner (Scanner sc)
    {
    	System.out.println("Enter number to get natural log");
        double num = sc.nextDouble();
        double log = ln(num);
        System.out.println("Natural Log of " + num + " is " + log);
        logger.info("[LOG] of " + num + " is " + log);
    }
    public static void powScanner (Scanner sc)
    {
    	System.out.println("Enter the base a and exponent b");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double ans = pow(num1,num2);
        System.out.println(num1 + "power" + num2 + " is " + ans);
        logger.info("[POWER] of " + num1 + " raised to " + num2 + " is " + ans);
    }
    
    public static void main(String[] args) {
    	
        System.out.println("Scientific Calculator");
        System.out.println("Press 1 for square root \nPress 2 for factorial\nPress 3 for natural logarithm\nPress 4 for power function");
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input == 1) {
            squareRootScanner(sc);
        } else if (input == 2) {
            factorialScanner(sc);
        } else if (input == 3) {
            lnScanner(sc);
        } else if (input == 4) {
            powScanner(sc);
        } else {
            System.out.println("Invalid input");
            logger.info("[INVALID]");
        }

    }

}