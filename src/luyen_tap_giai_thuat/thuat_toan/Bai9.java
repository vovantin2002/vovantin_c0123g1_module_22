package luyen_tap_giai_thuat.thuat_toan;

public class Bai9 {
    public static void main(String[] args) {
        int n=0;
        int a =10;
        int b=100;
        for (int i = a; i <=b ; i++) {
            int m=i;
            n=0;
            for (int j = 0; m>0 ; j++) {
                n=m%10+n*10;
                m=m/10;
            }
            if(n==i){
                System.out.println(i);
            }
        }
    }
}
