import java.util.Random;
import java.util.Scanner;

public class task1{
    public static void main(String[] args) {
        Random r=new Random();
	    Scanner sc=new Scanner(System.in);
        int round=10;
        int a=0;
        int chance=0;
        int num =(int)(Math.random()*100);
        System.out.println("Welcome to the number gusseing game.");
        System.out.println("Lets start the game. You need to guess a random number. ");
            while(chance < round)
            {
               chance++;
        	   System.out.println("Enter your attempts: " + chance );
        	   System.out.println("Enter a guess number between 1 to 100:");
        	   int guess=sc.nextInt();
        	   if(guess==num) { 
        		   System.out.println("You guessed the number!\\n" + "You win!");
        		   a=1;
        		   break;
        	   }
        	   else if(guess>num)
        		   System.out.println("Your guess is too high.");
        	   else 
        		   System.out.println("Your guess is too low.");
        	   
        	}
            if (a == 0) {
            	System.out.println("You lose...");
            	System.out.println("The random number generated is " + num);
            	System.out.println("THE GAME IS OVER...!!");
            }
    }
}