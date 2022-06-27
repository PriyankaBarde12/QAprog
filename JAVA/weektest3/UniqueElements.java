package com.weektest3;

import java.util.Arrays;

public class UniqueElements 
{
	public static void main (String[] args)    
    {   
          
        int arr[] = { 33 ,45,3,2,3,5,33,6,8,90};  
        Arrays.sort(arr);  
        int len = arr.length;   
        int[] distinctArray = new int[20];  
        int index = 0;  
 
        for(int i = 0; i < len; i++){   
             while (i < len - 1 && arr[i] == arr[i + 1])   
                i++;  
            distinctArray[index] = arr[i];  
            index++;  
        }  
   
        for(int i = 0; i < index; i++)  
            System.out.print( distinctArray[i] + " ");   
    }         
      
}
