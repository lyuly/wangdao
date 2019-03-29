public class Question20 {
    public static void Printdata(int n) {
        double p=1,q=2,r;
        double sum=0;
        for(int i=0;i<20;i++) {
            sum+=q/p;
            r=p+q;
            p=q;
            q=r;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        int n=20;
        Printdata(n);
    }
}
