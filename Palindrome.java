/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
	   
	   if(isPalinDrome(number)){
	      System.out.println(number+" is PalinDrome");
	   }else{
	      System.out.println(number+" is not PalinDrome");
	   }
	}
	
	public static boolean isPalinDrome(int number){
	    int reminder,sum=0,temp;
	    temp=number;
	    while(temp>0){
	        reminder=temp%10;
	        sum=(sum*10)+reminder;
	        temp=temp/10;
	    }
	    if(number==sum){
	        return true;
	    }else{
	        return false;
	    }
	}
}
