import java.util.Scanner;

public class Question9{
    private static void wanshu(int n) {
        for(int i=2;i<n;i++) {
            int sum=0;
            for(int j=1;j<i;j++) {
                if(i%j==0)
                    sum+=j;
            }
            if(sum==i)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x=in.nextInt();
    in.close();
    wanshu(x);
    }
}