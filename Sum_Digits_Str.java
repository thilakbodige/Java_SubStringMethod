package com.SubStringMethod;
import java.util.*;
public class Sum_Digits_Str 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
        String s = "Ma7ic14N9";
           int sum=0;
           for(int i=0;i<=(s.length())-1;i++)
           {
        	 char ch=s.charAt(i);
        	 if(ch>='0'&&ch<='9')
        	 {
        		 int temp=Integer.parseInt(ch+"");
        		 sum=sum+temp;
        	 }
           }
           System.out.println("The Sum of the Digits in "+s+"is"+sum);
	}
}
