package luyen_tap_giai_thuat;

public class CheckNumber {
    public static void main(String[] args) {
        System.out.println(isNum(2));
    }
    public  static boolean isNum(int n){
        if(n%2==0){
            return  true;
        }else {
            return false;
        }
    }
}
