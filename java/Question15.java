import java.util.Scanner;

public class Question15 {
    private static void sortl(int x,int y,int z) {
        if(x>y) {
            int t=x;
            x=y;
            y=t;
        }
        if(x>z) {
            int t=x;
            x=z;
            z=t;
        }
        if(y>z) {
            int t=y;
            y=z;
            z=t;
        }
        System.out.println(x+" "+y+" "+z);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        in.close();
        sortl(x, y, z);
    }
}