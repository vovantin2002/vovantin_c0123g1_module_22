package luyen_tap_giai_thuat.thuat_toan;

public class Bai3 {
    public static void main(String[] args) {

        int [] arr={1, 2, 3, 3};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        int left = 0, right = arr.length - 1;
//        int leftSum = 0, rightSum = 0;
//        while (left < right) {
//            if (leftSum == rightSum && right - left == 2) {
//                return true;
//            }
//            if (leftSum <= rightSum) {
//                leftSum += arr[left];
//                left++;
//            } else {
//                rightSum += arr[right];
//                right--;
//            }
//        }
//        return false;
//    }
        int a=0,b=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length-1 ; j++) {
                a+=arr[i];
                b+=arr[j];
            }
        }
        if(a==b){
            System.out.println("mang dep");
        }else{
            System.out.println("mang khong dep");
        }
    }
}
