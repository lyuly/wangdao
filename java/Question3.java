public class Question3 {
    /*是否是水仙花数 */
    private static boolean isWtr(int n) {
        int a=n/100,b=n%100/10,c=n%100%10;
        boolean flag=false;
        if(a*a*a+b*b*b+c*c*c==n)
            flag=true;
        return flag;
    }
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++) {
            if(isWtr(i)==true)
            System.out.println(i);
        }
    }   
}