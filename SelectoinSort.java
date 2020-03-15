/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.ArrayList;
public class SelectoinSort
{
    public static void main(String[] args) {
	int[] list={100,12,15,3,1,10,7,23};
	  SelectoinSort(list);
	  Display(list);
	}
	
	public static void SelectoinSort(int[] list){
	   for(int j=0;j<list.length-1;j++)
	    for(int i=j+1;i<list.length;i++){
	        if(list[j]>list[i]){
	            int temp=list[j];
	            list[j]=list[i];
	            list[i]=temp;
	        }
	    }
	}
	
	
	public static void Display(int[] list){
	    for(int i=0;i<list.length;i++){
	  System.out.print(list[i]+" ");
	    }
	}
	
	
	
    
}
