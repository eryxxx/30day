import java.io.*;
import java.util.*;

public class Solution {

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        int max= 0;
        String num = Integer.toBinaryString(n);
        for(int i=0;i<num.length();i++){
        if(num.charAt(i) != '0')
           count = count +1;
            else{
                count = 0;
                continue;
            }
            if(count>max)
            max = count;
        }
        System.out.println(max);
    }
}