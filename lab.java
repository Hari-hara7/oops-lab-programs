package oopslab;


import java.util.Random;
import java.util.Scanner;



public class lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Random random=new Random();
   int randomNumber=random.nextInt(Integer.MAX_VALUE)+1;
   
   Scanner scanner=new Scanner(System.in);
   int guess=0;
   
   System.out.println("Welcome to guess my number game");
   System.out.println("i thinking a number");
   
   
   while(guess!=randomNumber) {
	   System.out.println("Enter your guess:");
	   guess=scanner.nextInt();
	   
	   
	   if(guess>randomNumber) {
		   
		   System.out.println("Higher try again");
	   }
	   else if(guess<randomNumber){
		   System.out.println("lower! try again");
	   }
	   else {
		   System.out.println("congratulation u  won the game");
	   }
   }
    
   
   scanner.close();
	}

}

