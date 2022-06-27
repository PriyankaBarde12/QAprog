package com.functionprogram;
import java.util.Scanner;

public class KrishnamurthyNumber {
	   static int fact(int number)   
		    {   
		        int f = 1;   
		        while (number != 0) {   
		            f = f * number;   
		            number--;   
		        }   
		        return f;   
		    }   
		     
		    static boolean checkNumber(int number)   
		    {   
		        int sum = 0;     
		          
		        int tempNumber = number;      
		          
		        while (tempNumber != 0) {   
		       
		            sum = sum + fact(tempNumber % 10);    
		            tempNumber = tempNumber / 10;   
		        }   
		        
		      
		        if(sum == number)  
		            return true;  
		        else  
		            return false;  
		    }   
		  
		    
		    public static void main(String[] args)   
		    {   
		        int num;       
		        Scanner sc = new Scanner(System.in);  
		        System.out.println("Enter any number:");   
		        num = sc.nextInt();  
		         
		        if (checkNumber(num))   
		            System.out.println(num + " is a krishnamurthy number");   
		        else  
		            System.out.println(num + "is not a krishnamurthy number"); 
		        sc.close();
		    }   
		}  

	


