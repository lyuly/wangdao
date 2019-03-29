public class Question10 {
    public static void main(String[] args) {
        double l=50;  //反弹高度
        double sum=100;  //总共经过长度
        for(int i=2;i<11;i++) {
            sum+=l*2;
            l/=2;
        }
        System.out.println("总共经过"+sum+"米"+",第10次反弹高度为"+l+"米");
    }
}