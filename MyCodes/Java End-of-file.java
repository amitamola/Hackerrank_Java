//https://www.hackerrank.com/challenges/java-end-of-file/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        int count = 0;
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext())
        {
            count++;
            System.out.println(count+" "+sc.nextLine());
        }
    }
}
