package luyen_tap_giai_thuat.thuat_toan;

import java.util.ArrayList;
import java.util.Arrays;

public class Bai6 {
    public static void main(String[] args) {
        String str = "abdceffecdba";
        String[] str1 = str.split("");
        System.out.println("mang ban dau: " + Arrays.toString(str1));
        ArrayList<String> arr = new ArrayList<String>();
        for (int i = 0; i < str1.length; i++) {
            for (int j = i + 1; j < str1.length; j++) {
                if ((str1[i].equals(str1[j]))) {
                    arr.add(str1[i]);
                }
            }
        }
        System.out.println(arr);
    }
}
