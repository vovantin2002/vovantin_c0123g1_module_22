import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s="CodegymDaNang";
        String [] s4=s.split("");
        String s3="";
        for (int j = 0; j < s.length(); j++) {
            if(s4[j]==s4[j].toUpperCase()){
               s3+=" "+s4[j].toLowerCase();
            }else{
                s3+=s4[j];
            }
        }
        System.out.println(s3);

        System.out.println(s3);

    }
}
