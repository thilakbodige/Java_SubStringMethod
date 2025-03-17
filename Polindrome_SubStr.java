package com.SubStringMethod;
import java.util.*;
public class Polindrome_SubStr
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();// String s = "Malayalam";
          for (int i=0;i<=s.length()-1;i++)
          {
            String temp = "";
            for (int j=i;j<s.length();j++)
            {
                char ch = s.charAt(j);
                    temp = temp + ch;
             

                String rev = "";
                for (int k=0;k<= temp.length()-1; k++) 
                {
                    char ch1 = temp.charAt(k);
                    rev = ch1+rev;
                }

                if (rev.equals(temp)) 
                {
                    System.out.println(temp);
                }
            }
        }
    }
}
