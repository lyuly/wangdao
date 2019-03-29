import java.util.Scanner;

public class Question7 {

    private static void count(String s) {
        String c1 = "[\u4e00-\u9fa5]";  //汉字范围
        String c2 = "[a-zA-Z]";         //字母范围
        String c3 = "[0-9]";            //数字范围
        String c4 = "\\s";              //空格范围

        int countc1 = 0;
        int countc2 = 0;
        int countc3 = 0;
        int countc4 = 0;
        int countother = 0;

        char[] s1 = s.toCharArray(); //字符串转为数组
        String[] s2 = new String[s1.length]; //汉字作为字符串
        for(int i = 0; i < s1.length; i++)
            s2[i] = String.valueOf(s1[i]);
        //遍历字符串数组中的元素
        for(String S: s2) {
            if(S.matches(c1))
                countc1++;
            else if(S.matches(c2))
                countc2++;
            else if(S.matches(c3))
                countc3++;
            else if(S.matches(c4))
                countc4++;
            else
                countother++;
        }
        System.out.println("输入汉字的个数为: "+countc1);
        System.out.println("输入字母的个数为: "+countc2);
        System.out.println("输入数字的个数为: "+countc3);
        System.out.println("输入空格的个数为: "+countc4);
        System.out.println("输入的其他字符个数: "+countother);
    }
    public static void main(String[] args) {
        System.out.println("请输入字符串: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();
        count(s);
    }
}