import java.util.Scanner;

public class Question26 {
    private static void isDay(String s) {
        int n=0;
        /*trim删除头尾空格符,equalsIgnoreCase不考虑大小写比较字符*/
        if(s.trim().equalsIgnoreCase("Mo")||s.trim().equalsIgnoreCase("Mon")||s.trim().equalsIgnoreCase("Mond"))
            n=1;
        if(s.trim().equalsIgnoreCase("Tu")||s.trim().equalsIgnoreCase("Tue")||s.equalsIgnoreCase("Tues"))
            n=2;
        if(s.trim().equalsIgnoreCase("We")||s.trim().equalsIgnoreCase("Wed")||s.trim().equalsIgnoreCase("Wedn"))
            n=3;
        if(s.trim().equalsIgnoreCase("Th")||s.trim().equalsIgnoreCase("Thu")||s.trim().equalsIgnoreCase("Thur"))
            n=4;
        if(s.trim().equalsIgnoreCase("Fr")||s.trim().equalsIgnoreCase("Fri")||s.trim().equalsIgnoreCase("Frid"))
            n=5;
        if(s.trim().equalsIgnoreCase("Sa")||s.trim().equalsIgnoreCase("Sat")||s.trim().equalsIgnoreCase("Satu"))
            n=6;
        if(s.trim().equalsIgnoreCase("Su")||s.trim().equalsIgnoreCase("Sun")||s.trim().equalsIgnoreCase("Sund"))
            n=7;
        switch(n) {
            case 1:
            System.out.println("星期一");
            break;
            case 2:
            System.out.println("星期二");
            break;
            case 3:
            System.out.println("星期三");
            break;
            case 4:
            System.out.println("星期四");
            break;
            case 5:
            System.out.println("星期五");
            break;
            case 6:
            System.out.println("星期六");
            break;
            case 7:
            System.out.println("星期天");
            break;
            default:
            System.out.println("输入错误");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        isDay(s);
    }
}