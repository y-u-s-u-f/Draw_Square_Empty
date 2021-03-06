package yusuf.com;

import java.util.Scanner;

public class draw_square_empty {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int number, i=1, k=1;
		boolean finish = false;
		
		System.out.print("Please enter a number: ");
		number = sc.nextInt();	
	
		while(!finish) {
		   switch(k%(number+1)) {
		      case 0:
		    	  finish = true;
			     break;
		      default:
		    	  while(i%(number+1) != 0){
		    		  if((k>1 && k<number) && (i>1 && i<number)) {
							System.out.print(" ");
						}
						else {		
						    System.out.print("*");
						}
				     i++;	
			     }
			     System.out.println();
			     i=1;
			     k++;
		   }
		}
	}
}