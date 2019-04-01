import java.util.Scanner;

public class Question31{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        System.out.println("请输入数组: ");
        for(int i=0;i<a.length;i++) {
            int x=in.nextInt();
            a[i]=x;
        }
        in.close();
        for(int i=0;i<a.length/2;i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}