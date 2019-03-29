public class Question27 {
    private static boolean isPrime(int n) {
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0)
                flag=false;
        }
        return flag;
    } //判断是否位质数

    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<100;i++) {
            if(isPrime(i)==true) {
                System.out.print(i+" ");
                count++;
                if(count%5==0)
                    System.out.println();
            }
        }
    }
}