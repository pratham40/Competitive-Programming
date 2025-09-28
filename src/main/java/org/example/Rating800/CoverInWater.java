package org.example.Rating800;

import java.util.Scanner;

public class CoverInWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            String str=sc.next();
            int cnt=0;
            boolean flag=false;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='.' && i+2<n && str.charAt(i+1)=='.' && str.charAt(i+2)=='.'){
                    flag=true;
                    break;
                }
                if (str.charAt(i)=='.') {
                    cnt++;
                }
            }
            if (flag){
                System.out.println(2);
            }else {
                System.out.println(cnt);
            }
        }
    }
}
