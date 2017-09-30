import java.util.Scanner;

public class hw15 {

    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int v1 = Integer.valueOf(str,16);
        System.out.println((char)v1);
    }
}
