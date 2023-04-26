package luyen_tap_giai_thuat.thuat_toan;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bai8 {
    public static void main(String[] args) {
        Set<Integer>set=new LinkedHashSet<>();
        int [] arr={1,4,5,2,1};
        int [] arr1={1,2,3};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr1.length ; j++) {
                if(arr[i]==arr1[j]){
                    set.add(arr[i]);
                }
            }
        }
        System.out.println(set);
    }
}
