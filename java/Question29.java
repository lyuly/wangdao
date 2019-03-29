import java.util.Scanner;

public class Question29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                int n=in.nextInt();
                a[i][j]=n;
            }
        in.close();
        int sum=0;
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                if(i==j)
                    sum+=a[i][j];
            }
        System.out.println("对角线之和为: "+sum);
    }
}