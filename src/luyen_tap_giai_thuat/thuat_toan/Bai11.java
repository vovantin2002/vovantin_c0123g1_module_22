package luyen_tap_giai_thuat.thuat_toan;

public class Bai11 {
    public static void main(String[] args) {
        int a=4, c=2,b= 11,z=0,n=0;
        for (int i = 0; z < b ; i++) {
             z=a+c+z;
             if(z>b){
                 break;
             }
             n=c+n;
        }
        System.out.println(b-n);
    }
}
