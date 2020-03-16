/*********************************https://github.com/vishalkumarsinghvi/JavaAlgoritham*********************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.
Undersatnding 
example :- 100,12,15,3,1,10,7,23
       step:-1    100,   ,15,3,1,10,7,23
       step:-2        12
       step:-3    compare then change 
       step:-4    100,100,15,3,1,10,7,23 //here 12 is store in key once while loop compleate we will change 
       step:-5    12,100,15,3,1,10,7,23
*******************************************************************************/
import java.util.ArrayList;
public class InterstionSort
{
    public static void main(String[] args) {
	int[] list={100,12,15,3,1,10,7,23};
	  InterstionSort(list);
	  Display(list);
	}
	
	public static void InterstionSort(int[] list){
	  for(int i=1;i<list.length;i++){
	      int key=list[i];//12
	      int j=i-1;//list[j]=100
	      while(j>-1 && list[j]>key){
	          list[j+1]=list[j];//100
	          j--;
	      }
	      list[j+1]=key;
	  }
	  }

	
	
	public static void Display(int[] list){
	    for(int i=0;i<list.length;i++){
	  System.out.print(list[i]+" ");
	    }
	    System.out.println("");
	}
	
	
	
    
}
