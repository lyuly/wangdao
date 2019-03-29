import java.util.Scanner;

public class Question4 {
    //判断是否为质数
    private static boolean isPrime(int n) {
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)
                flag=false;
        }
        return flag;
    }

    private static void splitPrime(int n) {
        if(isPrime(n)==true)
            System.out.println(n);  //若n为质数直接打印
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                System.out.print(i+"*");
                if(isPrime(n/i)==true) {
                    System.out.print(n/i);  //n/i为质数直接打印否则下一步
                    break;
                }
                else
                splitPrime(n/i);  //递归
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int x = in.nextInt();
        in.close();
        System.out.print(x + "=");
        splitPrime(x);
    }
}