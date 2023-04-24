package luyen_tap_giai_thuat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UocChung {
//    public static int[] findCommonDivisors(int num){
//        // Khởi tạo mảng rỗng để lưu trữ các ước chung
//        int[] commonDivisors = new int[0];
//
//        // Duyệt qua các số từ 1 đến num/2 để tìm các ước chung
//        for(int i=1; i <= num/2; i++){
//            // Nếu i là ước của num thì thêm i vào mảng commonDivisors
//            if(num % i == 0){
//                int[] temp = new int[commonDivisors.length + 1];
//                System.arraycopy(commonDivisors, 0, temp, 0, commonDivisors.length);
//                temp[commonDivisors.length] = i;
//                commonDivisors = temp;
//            }
//        }
//        // Thêm ước num vào mảng nếu num khác 0
//        if(num != 0){
//            int[] temp = new int[commonDivisors.length + 1];
//            System.arraycopy(commonDivisors, 0, temp, 0, commonDivisors.length);
//            temp[commonDivisors.length] = num;
//            commonDivisors = temp;
//        }
//        return commonDivisors;
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        List<Integer>list=new ArrayList<>();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum+=i;
//                list.add(i);
            }
        }
        System.out.println(sum);
    }
}
