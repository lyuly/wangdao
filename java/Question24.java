import java.util.Scanner;
import java.util.Stack;

public class Question24 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数:");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        int count=0,x=n;
        Stack<Integer> s = new Stack<Integer>();
        while(n!=0) {
            s.push(n%10);
            n/=10;
            count++;
        }
        for(int i : s)
            System.out.print(i+" ");
        System.out.println(x+"是"+count+"位数");
    }
}