import java.util.Scanner;

public class Question6 {
    private static int gcd(int p,int q) {
        if(q==0)
            return p;
        int r = p%q;
        return gcd(q,r);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p=in.nextInt(),q=in.nextInt();
        in.close();
        System.out.println(p+"和"+q+"最大公约数为"+gcd(p,q));
        System.out.println(p+"和"+q+"最小公倍数为"+p*q/gcd(p,q));
    }
}