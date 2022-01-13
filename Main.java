package fr.aldayeh.firstTp;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		System.out.println("Bienvenue au juste prix !  :)\n");
		
		Random r =new Random();
		int goal = r.nextInt(100);
		int playerValue =0;
		
		
		Scanner scan =new Scanner(System.in);
		
		while(goal!=playerValue) {
			
			System.out.println("Choisissez un nombre entre 0 et 100 :");
	
			playerValue =scan.nextInt();
			if(playerValue>goal)
			{
				System.out.println("trop grand  !");
			}
			else if(playerValue<goal) {
				
				System.out.println("trop petit  !");
			}
			else 
			{
				System.out.println("Bien joué  !");
				
			}
				
			
			
			
		}
		
		scan.close();
		

	}
	

}
