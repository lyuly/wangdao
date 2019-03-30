import java.util.Arrays;
import java.util.Scanner;

public class Question30 {
    private static void SelectSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            int min = i;
            for(int j = i+1; j < a.length; j++) {
                if(less(a[j],a[min])) min = j;
            }
            exch(a, i, min); 
        }
    } // 选择排序

    private static boolean less(int m,int n) {
        return m<n?true:false;
    } // 比较

    private static void exch(int[] a,int i,int j) {
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    } // 交换

    private static int findItem(int[] a,int x) {
        int i=0;
        for(i=0;i<a.length;i++) {
            if(x<a[i]){
                return i;
            }
        }
        return i;
    } // 查找插入位置

    private static int[] InsertItem(int[] a,int x) {
        int[] b = new int[a.length+1];
        int t=findItem(a, x);
        b[t]=x;
        for(int i=0;i<t;i++)
            b[i]=a[i];
        for(int i=t+1;i<b.length;i++)
            b[i]=a[i-1];
        return b;
    } // 插入元素

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {0,2,3,9,1,4,7,5,6,8};
        System.out.println("请输入插入的数字: ");
        int x = in.nextInt();
        in.close();
        SelectSort(a);
        int[] c = InsertItem(a, x);
        System.out.println("插入后，数组为:");
        for(int i=0;i<c.length;i++)
            System.out.print(c[i]+" ");
    }
}