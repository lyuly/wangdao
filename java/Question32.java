import java.util.Scanner;

public class Question32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int a = n>>4;
        int b = ~(~0<<4);
        System.out.println(a&b);
    }
}