/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raj
 */

import java.util.*;
import java.io.*;
import java.lang.*;

public class SubsetOfString 
{
    // str: Stores input string
    // curr: Stores current subset
    // index: Index in current subset, curr
    
    static void powerSet(String str, int index, String curr)
    {
        int n = str.length();
        
        // base case
        if (index == n)
        {
            System.out.println(curr);
            return;
        }
        
        // Two cases for every character 
        // (i) we consider the character as part of current subset
        // (ii) We do not consider current character as part of current subset
        powerSet(str, index +1, curr+str.charAt(index));
        powerSet(str, index +1, curr);
    }
    
    // Driver code
    public static void main(String[] args)
    {
        String str = "abc";
        int index = 0;
        String curr = "";
        powerSet(str, index, curr);
    }
}
