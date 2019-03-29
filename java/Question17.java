public class Question17 {
    
    public static void main(String[] args) {
        int m=1,n=0;
        for(int i=9;i>=1;i--) {
            n=(m+1)*2;
            m=n;
        }
        System.out.println(n);
    }
}