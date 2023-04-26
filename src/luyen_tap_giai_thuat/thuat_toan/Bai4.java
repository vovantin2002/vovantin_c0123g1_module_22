package luyen_tap_giai_thuat.thuat_toan;

public class Bai4 {
    public static void main(String[] args) {
        String str = "H e l l    o C o d e G y                              m";
        System.out.println(str);
        String str2 = str.replace(" ", "");
        System.out.println(str2);
        String[] string = str2.split("");
        String str1 = "";
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals(string[i].toUpperCase())) {
                str1 += " " + string[i].toLowerCase();
            } else {
                str1 += string[i];
            }
        }
        System.out.println(str1.trim());
    }
}
