public class Question2{
    public static boolean isPrime(int n) {
        boolean flag=true;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        int count=0;
        for(int i = 102; i < 200; i++) {
            if(isPrime(i)==true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("总共"+ count +"个素数");
    }
}