package loops.sportcode.pl;

import java.util.Scanner;

public class LoopDoWhile 
{
   public static void main(String[] args)
   {
	   int number ;
	   Scanner read = new Scanner(System.in) ;
	   
	   System.out.println("Podaj liczbe");
	   number = read.nextInt() ;
	   do
	   {
		   --number ;
		   System.out.println("Witaj w petli");
	   }
	   while(number>0) ;
   }
}
