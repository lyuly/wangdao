public class Question21 {
    private static long factor(long n) {
        int m=1;
        for(int i=1;i<n+1;i++)
            m*=i;
        return m;
    } //阶乘
    
    public static void main(String[] args) {
        long sum=0;
        for(int i=1;i<=20;i++) {
            sum+=factor(i);
        }
        System.out.println(sum);
    }
}