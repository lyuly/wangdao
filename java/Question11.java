public class Question11 {
    public static void main(String[] args) {
        int count=0,sum=0;
        for(int i=1;i<5;i++) {
            for(int j=1;j<5;j++) {
                if(j==i)
                    continue;
                for(int k=1;k<5;k++) {
                    if(k!=i&&k!=j) {
                        sum=100*i+10*j+k;
                        System.out.print(sum+" ");
                        if((++count)%5==0) //5个数字回车
                            System.out.println();
                    }
                }
            }
        }
        System.out.println();
        System.out.println("符合条件的个数共: "+count+"个");
    }
}