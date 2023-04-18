package luyen_tap_giai_thuat.bai_2;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String str1=sc.nextLine();
//        String str1 = "abcabcabcdef";
        String[] str2 = str1.split("");
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < str1.length(); i++) {
            int cout = 0;
            for (int j = 0; j < str1.length(); j++) {
                String a = str2[i];
                if (a.equals(str2[j])) {
                    cout++;
                }
            }
            map.put(str2[i], cout);
        }
        for (Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e.getKey()+"-"+e.getValue());
        }
//        System.out.println(map);
    }
}
