package luyen_tap_giai_thuat.thuat_toan;

import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        String str = "acbadvdfvdf";
        String str1 = "acbadvdfvdf";
        String[] string = str.split("");
        String[] string1 = str1.split("");
        int cout = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length; i++) {
            cout = 0;
            for (int j = 0; j < string1.length; j++) {

                if (string[i].equals(string1[j])) {
                    cout++;
                    map.put(string[i], cout);
                }
            }
        }
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + "-" + e.getValue());
        }
        System.out.println(map.size());
    }
}
