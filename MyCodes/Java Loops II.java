//https://www.hackerrank.com/challenges/java-loops/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

import java.util.*;
import java.io.*;
import java.lang.Math;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            double to_p = a;
            
            for (int x=0; x<n; x++)
            {
                to_p = to_p + (Math.pow(2, x)* b);
                System.out.print((int)to_p+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
