public class Question19 {
    private static void Printstar(int n) {
        for(int i=-4;i<Math.abs(n);i++) {
            for(int j=0;j<Math.abs(i);j++)
                System.out.print(" ");
            for(int k=0;k<9-2*Math.abs(i);k++)
                System.out.print("*");
            for(int j=0;j<Math.abs(i);j++)
                System.out.print(" ");
            System.out.println();
        }
    } //打印菱形

    public static void main(String[] args) {
        int n=5;
        Printstar(n);
	}
}