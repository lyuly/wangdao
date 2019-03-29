public class Question22 {
    private static long Factor(long n) {
        if(n<=1)
            return 1; 
        return n*Factor(n-1);
    }

    public static void main(String[] args) {
        System.out.println(Factor(5));
    }
}