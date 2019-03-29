public class Question13 {

    private static boolean isSquare(int n) {
        boolean flag=false;
        for(int i=1;i<Math.sqrt(n)+1;i++) {
            if(Math.pow(i, 2)==n) {
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int n=0;
        for(int i=0; i<100000; i++) {
            if(isSquare(i+100)==true&&isSquare(i+268)==true) {
                n=i;
                break;
            }
        }
        System.out.println(n);
    }
}