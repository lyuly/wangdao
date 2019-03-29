import java.util.Scanner;

public class Question25 {
    public static void main(String[] args) {
        System.out.println("请输入一个5位数:");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        char[] c = s.toCharArray();  //字符串转字符数组
        int[] a = new int[s.length()];
        for(int i=0;i<s.length();i++)
            a[i]=c[i]-'0';  //字符串数组转为数字数组
        if(a[0]==a[4]&&a[1]==a[3])
            System.out.println(s+"是回文数");
        else
            System.out.println(s+"不是回文数");
    }
}