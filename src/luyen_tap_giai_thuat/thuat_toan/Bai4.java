package luyen_tap_giai_thuat.thuat_toan;

public class Bai4 {
    public static void main(String[] args) {
        String str = "Hello CodeGym";
        if(str.contains(" ")){
            str.replace(" ","");
        }
        String[] string = str.split("");
        String str1 = "";
        String str2=" ";
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals(string[i].toUpperCase())) {
                if (string[i].equals(str2)&&string[i+1].equals(str2)) {

                } else {
                    str1 += " " + string[i].toLowerCase();
                }

            } else {
                str1 += string[i];
            }
        }
        System.out.println(str1.trim());
    }
}
