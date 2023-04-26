package luyen_tap_giai_thuat.thuat_toan;

import java.util.*;


public class Bai7 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 43},
                {9, 49, 11, 7},
                {11, 23, 4, 0},
                {1, 2, 6, 51}};
        Set<Integer> arr1 = new TreeSet<>();
        int cout;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                cout = 0;
                for (int k = 2; k <= arr[i][j]; k++) {
                    if (arr[i][j] % k == 0) {
                        cout++;
                    }
                }
                if (cout == 1) {
                    arr1.add(arr[i][j]);
                }
            }
        }
        System.out.println(arr1);
    }
}
