import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark = in.nextInt();
        in.close();
        char level=mark>=90?'A':(mark>=60?'B':'C');
        System.out.println(level);
    }
}