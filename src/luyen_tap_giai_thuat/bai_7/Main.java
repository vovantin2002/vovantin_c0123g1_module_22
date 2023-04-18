package luyen_tap_giai_thuat.bai_7;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        String str="acbfedgsf";
        System.out.println(str);
       char []str1=str.toCharArray();
//        System.out.println(Arrays.toString(str1));
        Arrays.sort(str1);
        String str2=new String(str1);
        System.out.println(str2);

    }



}
