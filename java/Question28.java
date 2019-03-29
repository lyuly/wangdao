import java.util.Scanner;

public class Question28 {
    private static void selectionSort(int[] a) {
        for(int i=0;i<a.length;i++) {
            int min = i;
            for(int j=i+1;j<a.length;j++) {
                if(less(a[j],a[min]))
                    min = j;
            }
             exch(a,i,min);
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }

    private static boolean less(int a,int b) {
        return a<b?true:false;
    } //比较

    private static void exch(int[] a,int i,int min) {
        int temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    } //交换

    public static void main(String[] args) {
        System.out.println("?????:");
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0;i<a.length;i++) {
            int n = in.nextInt();
            a[i] = n; 
        }
        in.close();
        selectionSort(a);
    }
}
