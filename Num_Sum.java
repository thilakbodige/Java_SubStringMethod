package com.SubStringMethod;
import java.util.*;
public class Num_Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.next();
		int sum=0;
		int count=0;
		for (int i=0;i<s.length();i++) 
		{
			String temp="";
			for (int j=i;j<s.length();j++) 
			{
				char ch=s.charAt(j);
				if (ch>='0'&&ch<='9') 
				{
					temp=temp+ch;
					count++;
				} 
				else 
				{
					break;
				}
			}
			if (!(temp.equals(""))) 
			{
				int n=Integer.parseInt(temp);
				sum=sum+n;
				if(count>=2) {
					i++;
				}
			}
		}
		System.out.println("The Sum of Numbers inside the String " +s+" is "+sum);
	}
}


