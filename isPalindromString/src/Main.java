import java.util.Scanner;

public class Main {

    static boolean ispalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String myString = input.nextLine();

        if (ispalindrom(myString)) {
            System.out.printf("Yes, %s is a palindrom string.", myString);
        } else {
            System.out.printf("No, %s is not a palindrom string. ", myString);
        }

    }
}