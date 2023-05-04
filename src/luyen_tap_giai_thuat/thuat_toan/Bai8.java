package luyen_tap_giai_thuat.thuat_toan;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Bai8 {
    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 2, 3, 2, 3, 1};
        int[] arr1 = {1, 2, 3};
        int cout = 0;
        boolean flag=true;
        List<Integer> set = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        while (flag){
            for (int i = 0; i < arr1.length; i++) {
                if (set.contains(arr1[i])) {
                    flag=false;
                }
            } cout++;
        }System.out.println(cout);
    }
}
