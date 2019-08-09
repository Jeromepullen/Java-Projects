import java.util.Scanner;

public class Cond {
    public static void main(String[] args) {
        Scanner what = new Scanner(System.in);
        int age;

        System.out.println("What is your age?");
        age = what.nextInt();

        System.out.println(age > 90 ? "You old yo" : "You ain't old");

    }

}
