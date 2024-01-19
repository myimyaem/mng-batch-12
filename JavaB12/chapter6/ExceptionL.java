 package JavaB12.chapter6;

import java.util.Random;
import java.util.Scanner;

public class ExceptionL  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int numToGuess = r.nextInt(4);
        numToGuess++;
        int x = 0;
        boolean win =false;
GAME:        while(!win){
            try {
                System.out.println("Enter a number:");
                x = input.nextInt();
                if(x==numToGuess){
                    System.out.println("Hooray! you got it!");
                    win=true;
                }
                else{
                    throw new NumberNotMatchException(x,numToGuess);
                } 
            }
             
            catch (NumberNotMatchException e) {
                System.out.println(e.getMessage());
                continue GAME;
            }
            finally{
                System.out.println("Thank you for playing");
            }
        }
        


    }
    
}

