package Task;

import java.util.Scanner;

// Check whose largest number in 3 inputs
// Write a program that takes in three numbers from the user and 
// outputs the largest number.
// if all numbers are equal it will print All numbers are equal
public class Task116 {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter 3 numbers seperated by space");
        int a,b,c;
        a = intput.nextInt();
        b = intput.nextInt();
        c = intput.nextInt();
        if((a==b) && (a == c) &&(b==c))
            System.out.println("All numbers are equal");
        else if((a>b) && (a >c))
            System.out.println(a+" is the largest number");
        else
            System.out.println("invalid input");
    }
    
}
