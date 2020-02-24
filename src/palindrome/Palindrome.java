package palindrome;

import java.util.*;

public class Palindrome {

    /**
     *
     * @author camac2045
     */
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);   //scanner
        String input, reverse = ""; // create both strings
        input = sn.nextLine();
        int len = input.length();
        System.out.println("Enter a string to dicover if it is a palindrome:");

        for (int i = 0; i < len; i++) //building the reverse string
        {
            reverse = reverse + input.charAt(i);
        }

        if (input.equalsIgnoreCase(reverse)) //checking if the string is a palindrome or not
        {
            System.out.println("The string is a palindrome!");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
