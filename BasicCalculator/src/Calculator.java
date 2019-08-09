import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number: ");
        fnum = calc.nextDouble();
        System.out.println("Enter second number: ");
        snum = calc.nextDouble();
        answer = fnum + snum;
        System.out.println("The sum of those numbers are: " + answer);
    }
}
