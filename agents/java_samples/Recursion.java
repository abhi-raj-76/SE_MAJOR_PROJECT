import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The sum of 1 + 2 + 3 + ... + " + n + " is " + sum(n));
    }

    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n-1);
    }
}