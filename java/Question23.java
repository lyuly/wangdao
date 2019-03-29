public class Question23 {
    private static int Printyear(int m,int n) {
        if(m==1)
            return 10;
        else
            return Printyear(m-1, n)+n;
    }
    
    public static void main(String[] args) {
        System.out.println("第五个人: "+Printyear(5,2)+"岁");
    }
}