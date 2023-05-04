package luyen_tap_giai_thuat.thuat_toan;

public class Bai12 {
    public static void main(String[] args) {
        int []arr={2 ,2 ,4 ,3, 2, 3,5};
        int s=0;
        for (int i = 0; i < arr.length ; i++) {
             s+=arr[i];
        }
        System.out.println(s);
        if(s%4!=0){
            s=s/4+1;
        }else {
            s=s/4;
        }
        System.out.println(s);
    }
}
