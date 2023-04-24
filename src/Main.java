import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int []arr= {2,4,6,8,10};
       int n=arr[1]-arr[0];
       boolean flag=true;
        for (int i = 2; i <arr.length ; i++) {
            if(arr[i]-arr[i-1]!=n){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("mang deu. ");
        }
    }
}
