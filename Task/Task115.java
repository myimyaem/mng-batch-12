package Task;

import java.util.Scanner;

public class Task115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String string1 = input.nextLine();
        StringBuilder sb = new StringBuilder(string1);
        System.out.println(sb.toString());
    }
}
