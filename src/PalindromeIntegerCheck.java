import java.util.Scanner;

public class PalindromeIntegerCheck {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println("This is palindrome integer.");
        } else System.out.println("This is not palindrome integer.");
    }

    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += (number % 10);
            number /= 10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number) {
        boolean isPalindrome = false;
        if (number == reverse(number)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
