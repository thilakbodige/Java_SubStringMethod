package com.SubStringMethod;
import java.util.*;
public class AllPossible_SubStr 
{
	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Name:");
     String s=sc.nextLine();
     for(int i=0;i<s.length();i++)
     {
    	 for(int j=i+1;j<=s.length();j++)
    	 {
    		 System.out.println(s.substring(i,j));
    	 }
     }
	}
}

//***************WE CAN ALSO WRITE THIS CODE AS***************//

//public class AllPossible_SubStr 
//{
	//public static void main(String[] args)
	//{
//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the Name:");
//String s=sc.nextLine();
//for(int i=0;i<=s.length-1;i++)
//{
    //String temp="";
	// for(int j=i;j<=s.length()-1;j++)
	 //{
        //Char ch=s.charAt(j);
		 //System.out.println(temp);
	 //}
//}
//}
//}