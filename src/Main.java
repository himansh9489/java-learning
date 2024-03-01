package src;

import java.lang.Math;

public class Main {
	
    public static void main(String[] args) {
        System.out.println(Math.PI);
        int temp = -123;
        int res = 0;

        while(temp != 0){
            int num = temp%10;
            temp = temp/10;
            res = res*10+num;
        }
        System.out.println(res);
    }
}