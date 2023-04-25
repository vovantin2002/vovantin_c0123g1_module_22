package luyen_tap_giai_thuat.thuat_toan;

import java.util.HashMap;
import java.util.Map;

public class Bai1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 3, 5};

        // Khởi tạo một Map để lưu trữ tần số xuất hiện của từng số nguyên
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int cout = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ++cout;
                    frequency.put(arr[i], cout);
                } else {
                    frequency.put(arr[i], cout);
                }
            }
        }
        boolean flag = true;
        for (Map.Entry<Integer, Integer> e : frequency.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
            if (e.getValue() % 2 != 0) {
                flag = false;
                break;
            } else {
                flag = true;
            }
        }
        System.out.println(flag);

    }
}

