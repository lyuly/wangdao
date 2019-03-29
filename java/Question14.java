import java.util.GregorianCalendar;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年份: ");
        int year = in.nextInt();
        System.out.println("请输入月份: ");
        int month = in.nextInt();
        System.out.println("请输入日期: ");
        int day = in.nextInt();
        in.close();
        int sum = 0;
        int[] monthem = new int[] {0,31,28,31,30,31,30,31,31,30,31,30};
        GregorianCalendar check = new GregorianCalendar();
        boolean isLeapyear = check.isLeapYear(year); //闰年返回true
        monthem[2]=isLeapyear?29:28; //判断2月份天数 
        for(int i=0;i<month;i++)
            sum+=monthem[i];
        sum+=day;
        System.out.println("这是"+year+"年的第"+sum+"天");
    }
}