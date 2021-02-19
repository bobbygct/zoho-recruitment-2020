package FirstRouundCodes;

import java.util.Scanner;

public class FirstRound {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		
		String str = input.next();
		
		String temp="";
		
		int mid=str.length()/2;
		int n=str.length();
		
		for(int i=str.length()/2;i<str.length();i++) {
			
			
			temp=temp + str.charAt(i);
			System.out.println(temp);
			//(i==str.length()-1) {
			//FirstRound.firstHalf(temp,str);
			//}
			
		  }
		 for(int i=0;i<str.length()/2;i++) {
				
	        temp=temp + str.charAt(i);
		    System.out.println(temp);
				
	   }
        
	}

}
