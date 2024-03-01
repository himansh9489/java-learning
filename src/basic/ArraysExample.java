package src.basic;
import java.util.Scanner;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[][] arr = new int [3][3];//{1,2,3,4,5};
        for(int[] i:arr) {
            for(int j: i)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
