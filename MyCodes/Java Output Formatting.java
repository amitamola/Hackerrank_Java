//https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String xx = String.format("%03d", x);
                //Complete this line
                System.out.printf("%-15s",s1);
                System.out.print(xx);
                System.out.println();
            }
            System.out.println("================================");

    }
}
