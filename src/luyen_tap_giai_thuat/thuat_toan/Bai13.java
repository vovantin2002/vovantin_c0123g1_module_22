package luyen_tap_giai_thuat.thuat_toan;

import java.util.Arrays;

public class Bai13 {
    public static void main(String[] args) {
        int []arr={8, 3, 6, 1, 5, 4};
        int max=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[j]>max){
                    max=arr[j];
                }
            }
//            if(arr[i]<max&&arr[i]>);
        }


        System.out.println(max);
        System.out.println(Arrays.toString(arr));
    }
}
