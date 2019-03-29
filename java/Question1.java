import java.util.Scanner;

public class Question1 {
    public static int feibo(int n) {
        if(n==0||n==1)
        return 1;
        int f0=1,f1=1,f3=0;
        for(int i=1;i<n;i++) {
            f3=f0+f1;
            f0=f1;
            f1=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        in.close();
        System.out.println(feibo(a));
    }
}