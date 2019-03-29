import java.util.Scanner;

public class Question8 {
    private static int add(int a,int n) {
        int s=0;
        int b=0;
        for(int i=0;i<n;i++) {
            b=b*10+a;
            s=s+b;
        }
        return s;
    } //求和

    private static String express(int a,int n) {
        StringBuffer sub = new StringBuffer();
        StringBuffer subSB = new StringBuffer();
        sub.append("=");
        for(int i=0;i<n;i++) {
            subSB = subSB.append(a);
            sub = sub.append(subSB);
            if(i<n-1)
            sub = sub.append("+");
        }
        return sub.toString();
    } // 所算表达式

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int a=in.nextInt();
        System.out.println("请输入键盘控制数: ");
        int n=in.nextInt();
        in.close();
        System.out.println(add(a, n)+express(a, n));
    }
}