public class Question18 {
    public static void main(String[] args) {
        char i,j,k;
        for(i = 'x'; i <= 'z'; i++) {
            for(j = 'x'; j <= 'z'; j++) {
                if(i!=j) {
                    for(k = 'x'; k <= 'z'; k++) {
                        if(i!=k&&j!=k) {
                            if(i!='x'&&k!='x'&&k!='z') {
                                System.out.println("a-"+i);
                                System.out.println("b-"+j);
                                System.out.println("c-"+k);
                            }
                        }
                    }
                }
            }
        }
    }
}