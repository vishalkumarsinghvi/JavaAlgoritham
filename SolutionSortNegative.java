import java.io.*;
import java.util.*;

/*
 *Q1. Sort an array without changing position of negative numbers
Given an array arr[] of N integers, the task is to sort the array without changing the position of negative numbers (if any) i.e. the negative numbers need not be sorted.
Examples:
Input: arr[] = {2, -6, -3, 8, 4, 1}
Output: 1 -6 -3 2 4 8
Input: arr[] = {-2, -6, -3, -8, 4, 1}
Output: -2 -6 -3 -8 1 4

 */

class SolutionSortNegative {
  public static void main(String[] args) {
  int[] arr = {2, -6, 0, -3, 8,1, 4, 1};
    sort(arr);
    display(arr);
    
  }
  
  public static void sort(int[] a){
  for(int i=0;i<a.length-1;i++){
  for(int j=i+1;j<a.length;j++){
      if( a[i]>=0 && a[j]>=0 && a[i]>a[j]){
        int temp=a[j];
        a[j]=a[i];
        a[i]=temp;
      }
  }
  }
}
  
  public static void display(int[] a){
  for (int i =0;i<a.length;i++) {
      System.out.println(a[i]+" ");
    }
  }
}
