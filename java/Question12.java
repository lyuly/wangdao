import java.util.Scanner;

public class Question12 {
    private static long allprofit(long profit) {
        long sum=0,sub=profit;  // 先处理最高的利润
        if(profit>1000000) {
            profit=sub-1000000;
            sub=1000000;
            sum+=profit*0.01;
        }
        if(profit>600000) {
            profit=sub-600000;
            sub=600000;
            sum+=profit*0.015;
        }
        if(profit>400000) {
            profit=sub-400000;
            sub=400000;
            sum+=profit*0.03;
        }
        if(profit>200000) {
            profit=sub-200000;
            sub=200000;
            sum+=profit*0.05;
        }
        if(profit>100000) {
            profit=sub-100000;
            sub=100000;
            sum+=profit*0.075;
        }
        sum+=sub*0.1;
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("请输入利润: ");
        Scanner in = new Scanner(System.in);
        long profit = in.nextLong();
        in.close();
        System.out.println("应发奖金为: "+allprofit(profit));
    }
}