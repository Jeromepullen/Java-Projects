import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 10) {
            System.out.println("Enter a number ");
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your average is "+ average);
    }
}
