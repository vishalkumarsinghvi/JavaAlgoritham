/******************************************************************************

                            Online ava Compiler.
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
	   for(int i=0;i<list.length-1;i++)
	    for(int j=i+1;j<list.length;j++){
	        if(list[i]>list[j]){
	            int temp=list[i];
	            list[i]=list[j];
	            list[j]=temp;
	        }
	    }
	}
	
	
	public static void Display(int[] list){
	    for(int i=0;i<list.length;i++){
	  System.out.print(list[i]+" ");
	    }
	}
	
	
	
    
}
