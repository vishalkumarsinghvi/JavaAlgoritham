/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
    public static void main(String args[] ) throws Exception {
        int a[]={2,4,1,6,8,5,3,7,9,12,0};
        System.out.println("Starting merge sort");
        new TestClass().mergeSort(a);
        new TestClass().displayArray(a);
    
    }
    
    public void mergeSort(int a[]){
        int n=a.length;
        if (n<2)
        return;
        int mid=n/2;
        int left[]=new int[mid];
        int right[]=new int[n-mid];
        for(int i=0;i<mid;i++){
            left[i]=a[i];
        }
        for(int i=mid;i<n;i++){
            right[i-mid]=a[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,a);
      
    }
    public void merge(int left[],int right[],int a[]){
    int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if (left[i]<right[j]){
              a[k]=left[i];
              i++;
            } 
            else{
              a[k]=right[j];
              j++;
            } 
              k++;
        }
        while(i<left.length){
           a[k]=left[i];
              i++;
              k++;
        }
        while(j<right.length){
            a[k]=right[j];
              j++;
              k++;
        }    
    }
    
    public void displayArray(int x[]){
        for(int i:x){
        System.out.print(i+" ");
        }
        System.out.println(" ");
    
    }
}
