package luyen_tap_giai_thuat.bai_3;

public class Fibonacci {


    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        for (int i = 0; c <100 ; i++) {
            c=a+b;
            if(c>100){
                break;
            }
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
