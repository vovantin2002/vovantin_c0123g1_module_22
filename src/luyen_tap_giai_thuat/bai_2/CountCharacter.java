package luyen_tap_giai_thuat.bai_2;

import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {
        Set<String> stringList=new HashSet<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap chuoi can kiem tra: ");
        String str=sc.nextLine();
        System.out.println(str);
        String string=str.toLowerCase();
        System.out.println(string);
        String[] string1=string.split("");
        int cout;
        for (int i = 0; i <string.length() ; i++) {
            cout=0;
            for (int j = 0; j <string.length() ; j++) {

                if(string.charAt(j)==(string.charAt(i))){
                    cout++;
                    stringList.add(string1[j]);
                }
            }if(stringList.contains(string1[i])){
               continue;
            }
                System.out.println(cout+"  "+string.charAt(i));


        }


    }


}
