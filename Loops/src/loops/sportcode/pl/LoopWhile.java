package loops.sportcode.pl;

import java.util.Scanner;

public class LoopWhile 
{
	public static void main(String[] args)
	{
		int number ;
		Scanner read = new Scanner(System.in) ;
		
		System.out.println("Podaj liczbe") ;
		number = read.nextInt() ; 
		while(number>0)
		{
			--number ;
			System.out.println("Witaj w petli while");
		}
	}
}
