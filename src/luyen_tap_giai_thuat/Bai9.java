package luyen_tap_giai_thuat;

import java.util.Arrays;

public class Bai9 {
    public static void main(String[] args) {
        int []arr={2,5,4,7,8,9,234,12,6};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // hoán đổi 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n-2]);
    }
}
